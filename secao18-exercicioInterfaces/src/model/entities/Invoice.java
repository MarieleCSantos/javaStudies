package model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Invoice {

    private Double basicPayment;
    private Double tax;

    public Double getTotalPayment() {
        return getBasicPayment() - getTax();
    }
}
