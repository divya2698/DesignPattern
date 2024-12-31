package edu.neu.csye7374;

public class Stock implements Tradable{
	public Stock() {
    }

    public Stock(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "bid=" + bid +
                ", metric=" + metric +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    private double bid;
    private int metric;

    private String name;
    private double price;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getBid() {
        return this.bid;
    }

    @Override
    public int getMetric() {
        return this.metric;
    }
}
