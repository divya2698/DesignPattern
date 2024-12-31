package edu.neu.csye7374;

/**
 * @author SaiAkhil
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        StockAPI ibmStock = new StockAPI("IBM", 131.15, "IBM Common Stock", new AverageBidPerformanceMetricStrategy());
        StockAPI googleStock = new StockAPI("GOOGL", 2700.0, "Alphabet Inc. (Google) Class A Common Stock", new MaxMinBidPerformanceMetricStrategy());

        for (double bid : new double[]{130.0, 132.0, 129.5, 133.5, 131.8, 134.2}) {
            ibmStock.setBid(bid);
            googleStock.setBid(bid);

            System.out.println("IBM Stock:\n" + ibmStock);
            System.out.println("IBM Performance Metric: " + ibmStock.getMetric());

            System.out.println("Google Stock:\n" + googleStock);
            System.out.println("Google Performance Metric: " + googleStock.getMetric());

            System.out.println("----------");
        }

        // Change the performance metric strategy for IBM Stock
        ibmStock = new StockAPI("IBM", 131.15, "IBM Common Stock", new CustomPerformanceMetricStrategy());
        System.out.println("Changed IBM Performance Metric Strategy to Custom");

        for (double bid : new double[]{135.0, 130.5, 137.0}) {
            ibmStock.setBid(bid);

            System.out.println("IBM Stock:\n" + ibmStock);
            System.out.println("IBM Performance Metric: " + ibmStock.getMetric());

            System.out.println("----------");
        }

        System.out.println("\n\n============Main Execution End===================");
    }
}
