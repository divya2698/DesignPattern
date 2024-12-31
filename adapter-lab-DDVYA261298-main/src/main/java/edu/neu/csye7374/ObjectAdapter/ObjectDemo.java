package edu.neu.csye7374.ObjectAdapter;

import java.util.Arrays;
import java.util.List;

public class ObjectDemo {
    public static void simulate() {
    	
    	System.out.println("------- Using Object Adapter Pattern -------\n");
        // Create an instance of the existing calculator
        CalculateAPI calculator = new Calculator();

        // Create an instance of the adapter
        AccumulateAPI adapter = new CalculatorAdapter(calculator);

        // Prepare a list of item prices
        List<Double> itemPrices = Arrays.asList(5.0, 26.0, 33.0, 42.0);

        // Call the accumulation method through the adapter
        double total = adapter.accumulation(itemPrices);
        System.out.println("Total accumulated amount: " + total);

        // Make a payment using the payment method through the adapter
        double paymentAmount = 70.0;
        double remainingAmount = adapter.payment(paymentAmount);
        System.out.println("Remaining amount after payment: " + remainingAmount);
    }
}
