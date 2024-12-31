package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Stocks.Stock;
import edu.neu.csye7374.Stocks.TeslaStock;

public class TeslaStockFactory extends StockFactory{
    public Stock createStock() {
        return new TeslaStock("TSLA", 150.25, "Elon", 400);
    }
}
