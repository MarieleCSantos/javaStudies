package model.services;

import lombok.AllArgsConstructor;
import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService brazilTaxService;

    public void processInvoice (CarRental carRental) {
//        long durationHours = ChronoUnit.HOURS.between(carRental.getFinish(), carRental.getStart());
//        long durationDays = ChronoUnit.DAYS.between(carRental.getFinish(), carRental.getStart());

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;

        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
