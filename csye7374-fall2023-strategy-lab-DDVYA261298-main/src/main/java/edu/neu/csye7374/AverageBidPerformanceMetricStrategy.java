package edu.neu.csye7374;

import java.util.List;

public class AverageBidPerformanceMetricStrategy implements PerformanceMetricStrategy {

	@Override
	public int calculateMetric(List<Double> bids) {
		if (bids.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Double bid : bids) {
            sum += bid;
        }
        return (int) (sum / bids.size());
	}

}
