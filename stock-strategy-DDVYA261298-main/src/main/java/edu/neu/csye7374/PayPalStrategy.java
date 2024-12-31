package edu.neu.csye7374;

// Concrete Strategy: PayPal
class PayPalStrategy implements PaymentStrategyAPI {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
        // Add code to perform the actual PayPal payment here
    }
}

