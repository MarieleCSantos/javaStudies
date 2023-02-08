package model.services;

import lombok.AllArgsConstructor;
import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

@AllArgsConstructor
public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public void processContract(Contract contract, Integer months) {
        Double basicInstallment = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(basicInstallment, i);
            Double paymentFee = onlinePaymentService.paymentFee(interest + basicInstallment);
            Double finalInstallmentValue = basicInstallment + interest + paymentFee;

            contract.getInstallments().add(new Installment(dueDate, finalInstallmentValue));
        }

    }
}
