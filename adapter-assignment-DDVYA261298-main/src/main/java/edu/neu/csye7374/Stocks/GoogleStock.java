package edu.neu.csye7374.Stocks;

import edu.neu.csye7374.Interfaces.Tradeable1;

public class GoogleStock extends Stock implements Tradeable1{
    public GoogleStock(String name, double price, String description, int quantity) {
        super(name, price, description, quantity);
    }
    @Override
    public int getMetric() {
        int metric;

        if (getBid() > 2000) {
            metric = 4;
        } else if (getBid() > 1800) {
            metric = 3;
        } else if (getBid() > 1600) {
            metric = 2;
        } else if (getBid() > 1400) {
            metric = 1;
        } else {
            metric = -1;
        }

        return metric;
    }
}
