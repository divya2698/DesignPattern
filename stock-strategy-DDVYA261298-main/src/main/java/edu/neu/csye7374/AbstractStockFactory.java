package edu.neu.csye7374;

public abstract class AbstractStockFactory {
	public abstract Stock getObject(String name, double price, String description);
	
}
