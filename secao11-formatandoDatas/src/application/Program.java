package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter ftm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter ftm5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(ftm1));
        System.out.println("d05 = " + d05.format(ftm2));
        System.out.println("d06 = " + ftm3.format(d06));
        System.out.println("d05 = " + d05.format(ftm4));
        System.out.println("d05 = " + ftm5.format(d06));
    }
}
