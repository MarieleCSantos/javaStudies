package model.services;

public class PaypalService implements OnlinePaymentService{

    public Double interest(Double amount, Integer month) {
        return amount * month/100;
    }

    public Double paymentFee(Double amount) {
        return amount * 2/100;
    }
}
