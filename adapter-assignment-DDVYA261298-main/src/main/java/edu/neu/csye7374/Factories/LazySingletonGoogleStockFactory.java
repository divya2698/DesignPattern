package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Stocks.GoogleStock;
import edu.neu.csye7374.Stocks.Stock;

public class LazySingletonGoogleStockFactory extends StockFactory{
    private static LazySingletonGoogleStockFactory instance;
    
    private LazySingletonGoogleStockFactory() {
        // Private constructor to prevent instantiation
        instance = null;
    }
    
    public static synchronized LazySingletonGoogleStockFactory getInstance() {
        if (instance == null) {
            instance = new LazySingletonGoogleStockFactory();            
        }
        return instance;
    }
    
    @Override
    public Stock createStock() {
        return new GoogleStock("GOOG", 131.15, "Alphabet", 400);
    }
}
