package edu.neu.csye7374;

import java.util.List;

public class MaxMinBidPerformanceMetricStrategy implements PerformanceMetricStrategy {

	@Override
	public int calculateMetric(List<Double> bids) {
		 if (bids.isEmpty()) {
	            return 0;
	        }

	        double maxBid = Double.MIN_VALUE;
	        double minBid = Double.MAX_VALUE;
	        for (Double bid : bids) {
	            maxBid = Math.max(maxBid, bid);
	            minBid = Math.min(minBid, bid);
	        }
	        return (int) (maxBid - minBid);
	}

}
