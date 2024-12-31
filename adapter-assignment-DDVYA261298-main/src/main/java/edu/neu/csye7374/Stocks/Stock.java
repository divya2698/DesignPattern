package edu.neu.csye7374.Stocks;

import edu.neu.csye7374.Interfaces.Tradable;

public abstract class Stock implements Tradable {

    private String name;

    private double price;

    private String description;

    private double bid;

    private double metric;

    private double volatility;

    private int quantity;

    public Stock(String name, double price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.volatility = 1.0;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity; 
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public void setVolatility(double volatility) {
        this.volatility = volatility;
    }

    public double getBid() {
        return bid;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }

    public abstract int getMetric();

    public void calculatePrice() {
        price += (bid * volatility);
    }


    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", bid=" + bid +
                ", metric=" + metric +
                '}';
    }
}
