package edu.neu.csye7374;

public class Main {
    public static void main(String[] args) {
        // Create instances of StockA and StockB
        StockA stockA = new StockA("AAPL", 150.0, "Apple Inc. Common Stock");
        StockB stockB = new StockB("GOOGL", 2500.0, "Alphabet Inc. Class A Common Stock");

        // Simulate market trends by setting bids
        double[] bids = {2.0, -1.5, 3.0, -2.5, 1.0, 2.5};

        for (double bid : bids) {
            stockA.setBid(bid);
            stockB.setBid(bid);

            // Display the updated stock information and metrics
            System.out.println(stockA);
            System.out.println("StockA Metric: " + stockA.getMetric());
            System.out.println(stockB);
            System.out.println("StockB Metric: " + stockB.getMetric());
            System.out.println("-----------------------------");
        }
    }
}
