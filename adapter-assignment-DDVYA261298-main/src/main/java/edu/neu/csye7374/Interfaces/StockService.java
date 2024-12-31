package edu.neu.csye7374.Interfaces;

import edu.neu.csye7374.Stocks.Stock;

// Client API
public interface StockService {
    void buyStock(Stock stock, int quantity);
    void sellStock(Stock stock, int quantity);
    void displayStockDetails(Stock stock);
}