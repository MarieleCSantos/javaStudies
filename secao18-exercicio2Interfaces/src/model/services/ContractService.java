package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    public void processContract(Contract contract, Integer months) {
        for (int i = 0; i <= months; i++) {

            OnlinePaymentService service = new PaypalService();
            Double interest = service.interest(contract.getTotalValue(), i);
            Double paymentFee = service.paymentFee(interest);

            Installment installment = new Installment(contract.getDate().plusMonths(1), (contract.getTotalValue() + interest + paymentFee));

            contract.getInstallments().add(installment);
        }

    }
}
