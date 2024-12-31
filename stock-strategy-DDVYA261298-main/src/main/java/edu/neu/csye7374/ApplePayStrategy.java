package edu.neu.csye7374;

public class ApplePayStrategy implements PaymentStrategyAPI{
    private String applePayAccount;

    public ApplePayStrategy(String applePayAccount) {
        this.applePayAccount = applePayAccount;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Apple Pay.");
        // Add code to perform the actual Apple Pay payment here
    }
}
