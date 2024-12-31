package edu.neu.csye7374.Stocks;

import edu.neu.csye7374.Interfaces.Tradeable0;

public class TeslaStock extends Stock implements Tradeable0{
    public TeslaStock(String name, double price, String description, int quantity) {
        super(name, price, description, quantity);
    }
    @Override
    public int getMetric() {
        int metric;

        if (getBid() > 500) {
            metric = 3;
        } else if (getBid() > 400) {
            metric = 2;
        } else if (getBid() > 300) {
            metric = 1;
        } else {
            metric = -1;
        }

        return metric;
    }
}
