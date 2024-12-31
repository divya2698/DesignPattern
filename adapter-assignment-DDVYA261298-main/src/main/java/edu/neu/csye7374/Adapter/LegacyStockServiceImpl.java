package edu.neu.csye7374.Adapter;

import edu.neu.csye7374.Interfaces.LegacyStockService;
import edu.neu.csye7374.Stocks.Stock;

// Legacy implementation
public class LegacyStockServiceImpl implements LegacyStockService {
    
        @Override
        public double getCurrentPrice(Stock stock) {
            return stock.getPrice();
        }
    
        @Override
        public int getAvailableQuantity(Stock stock) {
            return stock.getQuantity();
        }
}


