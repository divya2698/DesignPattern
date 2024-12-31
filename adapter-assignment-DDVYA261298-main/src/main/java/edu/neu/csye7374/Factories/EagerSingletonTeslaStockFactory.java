package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Stocks.Stock;
import edu.neu.csye7374.Stocks.TeslaStock;

public class EagerSingletonTeslaStockFactory extends StockFactory{
    private static final EagerSingletonTeslaStockFactory instance = new EagerSingletonTeslaStockFactory();
    
    private EagerSingletonTeslaStockFactory() {
        // Private constructor to prevent instantiation
    }
    
    public static EagerSingletonTeslaStockFactory getInstance() {
        return instance;
    }
    
    @Override
    public Stock createStock() {
        return new TeslaStock("TSLA", 150.25, "Elon", 500);
    }
}
