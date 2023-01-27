package model.services;

import lombok.AllArgsConstructor;
import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTaxService brazilTaxService;

    public void processInvoice (CarRental carRental) {
        long durationHours = ChronoUnit.HOURS.between(carRental.getFinish(), carRental.getStart());
        long durationDays = ChronoUnit.DAYS.between(carRental.getFinish(), carRental.getStart());

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        if (durationHours <= 12) {

        } else {

        }

        carRental.setInvoice(new Invoice(50.0, 10.0));
    }
}
