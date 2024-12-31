package edu.neu.csye7374.stockApi;

public abstract class Stock implements Tradable{

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
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    //
//    private static Stock instance;
//
//    public Stock() {}
//
//    public static Stock getInstance() {
//
//        if(instance == null) {
//            synchronized (Stock.class) {
//                if (instance == null)
//                    instance = new Stock();
//            }
//        }
//
//        return instance;
//    }


}
