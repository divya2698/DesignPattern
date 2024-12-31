package edu.neu.csye7374;
import java.util.ArrayList;
import java.util.List;

public class StockAPI implements Tradable {
	 private String ID;
	    private double price;
	    private String description;
	    private List<Double> bids;
	    private PerformanceMetricStrategy metricStrategy;
	    public StockAPI(String ID, double price, String description, PerformanceMetricStrategy metricStrategy) {
	        this.ID = ID;
	        this.price = price;
	        this.description = description;
	        this.bids = new ArrayList<>();
	        this.metricStrategy = metricStrategy;
	    }

	@Override
	public void setBid(double bid) {
		bids.add(bid);
        price = bid;

	}

	@Override
	public int getMetric() {
		
		return metricStrategy.calculateMetric(bids);
	}
	
	@Override
    public String toString() {
        return "Stock ID: " + ID + "\n" +
               "Price: $" + price + "\n" +
               "Description: " + description + "\n";
    }

}
