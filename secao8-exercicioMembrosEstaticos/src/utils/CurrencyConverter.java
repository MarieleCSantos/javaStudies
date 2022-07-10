package utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double converter(double dollarPrice, double dollar){
        return dollarPrice * dollar * (1 + IOF);
    }

}
