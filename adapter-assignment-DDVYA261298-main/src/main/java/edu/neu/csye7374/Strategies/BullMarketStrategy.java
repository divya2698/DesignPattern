package edu.neu.csye7374.Strategies;

import edu.neu.csye7374.Stocks.Stock;

public class BullMarketStrategy implements StockStrategyAPI {
    @Override
    public void calculatePrice(Stock stock) {
        // Algorithm for calculating stock price in a Bull market
        stock.setVolatility(1.1);
    }
}
