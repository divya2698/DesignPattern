package edu.neu.csye7374;

import edu.neu.csye7374.factory.IbmStockFactory;
import edu.neu.csye7374.interfaces.Tradable;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
	
	private static StockMarket instance;
    private List<Tradable> stocks;

    private StockMarket() {
        stocks = new ArrayList<>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            synchronized (StockMarket.class) {
                if (instance == null) {
                    instance = new StockMarket();
                }
            }
        }
        return instance;
    }
    
    public void addStock(Tradable stock) {
        stocks.add(stock);
    }
    
    public void showAllStocks() {
        for (Tradable stock : stocks) {
            System.out.println(stock);
        }
    }
    
    public void tradeStocks(String name, double bid) {
        for (Tradable stock : stocks) {
            if(stock.getID().equals(name))
            	stock.setBid(bid);
        }
    }
    
    public void removeStock(String name) {
    	int index = -1;
    	for (int i=0;i < stocks.size();i++) {
            if(stocks.get(i).getID().equals(name))
            	index = i;
        }
    	if(index!=-1)
    		stocks.remove(index);
    }   
    
    public void startTrading() {
    	
    	System.out.println("Trading Started");

		Stock ibm = new IbmStockFactory().getObject();
		ibm.setPrice(20);
		ibm.setID("IBM");
		ibm.setDescription("IBM It Solutions");
    	
    	this.addStock(ibm);

    	this.addStock(new InfyStock("BINFY", 20, "Infosys Solutions"));
    	System.out.println("All  the stocks avaialble in the stock market at the start");
    	showAllStocks();
    	
    	tradeStocks("HP", 23);
    	tradeStocks("IBM", 24);
    	System.out.println("Current status of the Stocks in the stock market after the competion of bid one");
    	showAllStocks();
    	tradeStocks("HP", 26);
    	tradeStocks("IBM", 21);
    	System.out.println("Current status of the Stocks in the stock market after the competion of bid two");
    	showAllStocks();
    	tradeStocks("HP", 28);
    	tradeStocks("IBM", 18);
    	System.out.println("Current status of the Stocks in the stock market after the competion of bid three");
    	showAllStocks();
    	tradeStocks("HP", 23);
    	tradeStocks("IBM", 15);
    	System.out.println("Current status of the Stocks in the stock market after the competion of bid four");
    	showAllStocks();
    	tradeStocks("HP", 22);
    	tradeStocks("IBM", 20);
    	System.out.println("Current status of the Stocks in the stock market after the competion of bid five");
    	showAllStocks();
    	tradeStocks("HP", 25);
    	tradeStocks("IBM", 23);
    	System.out.println("Current status of the Stocks in the stock market after the competion of bid six");
    	showAllStocks();
    	showAllStocks();
    	
    	removeStock("HP");
    	System.out.println("Stocks avaialble in the stock market after removing a stock");
    	showAllStocks();
    }
    

}
