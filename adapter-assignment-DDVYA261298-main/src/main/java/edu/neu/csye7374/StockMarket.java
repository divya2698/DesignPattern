package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye7374.Factories.EagerBearMarketSingletonFactory;
import edu.neu.csye7374.Factories.EagerSingletonTeslaStockFactory;
import edu.neu.csye7374.Factories.LazyBullMarketSingletonFactory;
import edu.neu.csye7374.Factories.LazySingletonGoogleStockFactory;
import edu.neu.csye7374.Interfaces.Tradable;
import edu.neu.csye7374.Stocks.Stock;
import edu.neu.csye7374.Strategies.StockContext;

public class StockMarket {
    private static StockMarket instance;
    private List<Tradable> stocks;
    private StockMarket() {
        stocks = new ArrayList<>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }

        return instance;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public boolean removeStock(Stock stock) {
        return stocks.remove(stock);
    }

    public void tradeStock(Stock stock, double bid) {
        stock.setBid(bid);
        stock.calculatePrice();
        stock.setMetric(stock.getMetric());
    }

    public void showAllStocks() {
        for (Tradable stock : stocks) {
            System.out.println(stock);
        }
    }

    public static void demo() {
        StockMarket market = StockMarket.getInstance();
        StockContext context = new StockContext();

        EagerSingletonTeslaStockFactory eagerSingletonTeslaStockFactory = EagerSingletonTeslaStockFactory.getInstance();
        LazySingletonGoogleStockFactory lazySingletonGoogleStockFactory = LazySingletonGoogleStockFactory.getInstance();


        Stock teslaStock = eagerSingletonTeslaStockFactory.createStock();
        Stock googleStock = lazySingletonGoogleStockFactory.createStock();

        market.addStock(googleStock);
        market.addStock(teslaStock);


        // Trade Google stock
        googleStock.setBid(135.0);
        googleStock.setBid(137.5);
        googleStock.setBid(139.2);
        googleStock.setBid(140.8);
        googleStock.setBid(137.1);
        googleStock.setBid(132.9);
        System.out.println("Stocks after setting BID for Google:");
        market.showAllStocks();

        // Trade Tesla stock
        teslaStock.setBid(135.0);
        teslaStock.setBid(137.5);
        teslaStock.setBid(139.2);
        teslaStock.setBid(140.8);
        teslaStock.setBid(137.1);
        teslaStock.setBid(132.9);

        System.out.println("Stocks after setting BID for Tesla:");
        market.showAllStocks();

        LazyBullMarketSingletonFactory bullMarketSingletonFactory = LazyBullMarketSingletonFactory.getInstance();
        context.setStockStrategy(bullMarketSingletonFactory.createStrategy());
        context.calculatePrice(googleStock);

        EagerBearMarketSingletonFactory eagerBearMarketSingletonFactory = EagerBearMarketSingletonFactory.getInstance();
        context.setStockStrategy(eagerBearMarketSingletonFactory.createStrategy());
        context.calculatePrice(teslaStock);

        System.out.println("Stocks after trading:");
        market.tradeStock(googleStock, 200);
        market.tradeStock(teslaStock, 200);
        market.showAllStocks();
    }
}
