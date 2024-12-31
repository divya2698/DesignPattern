package edu.neu.csye7374;

public class Context {
	private StockStrategy strategy;

	public Context(StockStrategy strategy) {
	    this.strategy = strategy;
	}
	    public int getMetric(double bid, double price){
	        return this.strategy.getMetric(bid, price);
	    }
}
