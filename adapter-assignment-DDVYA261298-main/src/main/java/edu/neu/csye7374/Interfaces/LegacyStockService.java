package edu.neu.csye7374.Interfaces;

import edu.neu.csye7374.Stocks.Stock;

public interface LegacyStockService {
    double getCurrentPrice(Stock stock);
    int getAvailableQuantity(Stock stock);
}
