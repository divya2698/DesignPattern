package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Stocks.GoogleStock;
import edu.neu.csye7374.Stocks.Stock;

public class GoogleStockFactory extends StockFactory{
    public Stock createStock() {
        return new GoogleStock("GOOG", 131.15, "Alphabet", 400);
    }
}
