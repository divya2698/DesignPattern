package edu.neu.csye7374.ClassAdapter;

import java.util.Arrays;
import java.util.List;

public class ClassDemo {
    public static void simulate() {
    	
    	System.out.println("\n------- Using Class Adapter Pattern -------\n");
        // Create an instance of the adapter
        AccumulateAPI adapter = new CalculatorAdapter();

        // Prepare a list of item prices
        List<Double> itemPrices = Arrays.asList(10.0, 25.0, 34.0, 47.0);

        // Call the accumulation method through the adapter
        double total = adapter.accumulation(itemPrices);
        System.out.println("Total accumulated amount: " + total);

        // Make a payment using the payment method through the adapter
        double paymentAmount = 70.0;
        double remainingAmount = adapter.payment(paymentAmount);
        System.out.println("Remaining amount after payment: " + remainingAmount);
    }
}