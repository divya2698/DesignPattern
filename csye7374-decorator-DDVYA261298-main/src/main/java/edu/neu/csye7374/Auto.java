package edu.neu.csye7374;


// Base Auto class
class Auto implements AutoAPI {
    private int price;
    private String description;

    public Auto(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
