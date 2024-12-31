package edu.neu.csye7374.stockApi;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

    private static List<Stock> stockList;
    private static StockMarket instance;

    private StockMarket() {}

    public static StockMarket getInstance() {
        if(instance == null) {
            synchronized (StockMarket.class) {
                if(instance == null) {
                    instance = new StockMarket();
                }
            }
        }

        return instance;
    }

    synchronized public static List<Stock> getStockList() {
        if(stockList == null) {
            stockList = new ArrayList<>();
        }

        return stockList;
    }

    public void demo() {

        Stock ibm = IBM.getInstance();
        ibm.setName("IBM");
        ibm.setPrice(20.0);
        ibm.setDescription("IBM Inc.");
        ibm.setBid(21.0);
        System.out.println("IBM metrix = "+ibm.getMetric());

        ibm.setBid(22.0);
        ibm.setBid(23.0);
        ibm.setBid(24.0);
        ibm.setBid(25.0);
        ibm.setBid(32.0);
        System.out.println("IBM metrix after 6 bids= "+ibm.getMetric());

        Stock google = Google.getInstance();
        google.setName("Google");
        google.setPrice(30.0);
        google.setDescription("Google Inc.");
        google.setBid(31.0);
        System.out.println("Google metrix = "+ google.getMetric());
        google.setBid(32.0);
        google.setBid(33.0);
        google.setBid(34.0);
        google.setBid(35.0);
        google.setBid(42.0);
        System.out.println("Google metrix after 6 bids = "+ google.getMetric());

        getStockList().add(ibm);
        getStockList().add(google);

        System.out.println("Google stock: "+ google);
        System.out.println("IBM stock: "+ ibm);

        System.out.println("Stock list: "+ getStockList());

        getStockList().remove(ibm);
        getStockList().remove(google);

        System.out.println("Stock list after remove: "+ getStockList());

    }

}
