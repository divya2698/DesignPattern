package edu.neu.csye7374.Strategies;

import edu.neu.csye7374.Stocks.Stock;

public class StockContext {

    private StockStrategyAPI stockStrategy;

    public void setStockStrategy(StockStrategyAPI stockStrategy) {
        this.stockStrategy = stockStrategy;
    }

    public void calculatePrice(Stock stock) {
        stockStrategy.calculatePrice(stock);
    }

}
