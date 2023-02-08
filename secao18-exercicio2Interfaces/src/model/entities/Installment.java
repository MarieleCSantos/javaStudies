package model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Installment {
    private LocalDate dueDate;
    private Double amount;

    @Override
    public String toString() {
        return dueDate + " - " + amount + "\n";
    }
}
