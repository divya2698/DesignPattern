package edu.neu.csye7374;

public class CreditCardStrategy implements PaymentStrategyAPI{
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
        // Add code to perform the actual credit card payment here
    }
}
