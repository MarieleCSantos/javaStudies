package entities;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositing(initialDeposit);
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountName) {
        this.accountNumber = accountNumber;
    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

    public void depositing (double amount){
        balance += amount;
    }

    public void withdrawing(double amount){
        balance -= (amount + 5.00);
    }



}
