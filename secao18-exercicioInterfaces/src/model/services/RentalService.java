package model.services;

import lombok.AllArgsConstructor;
import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

@AllArgsConstructor
public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;

    public void processInvoice (CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;

        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
