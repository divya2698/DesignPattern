package edu.neu.csye7374;

import java.util.List;

public class CustomPerformanceMetricStrategy implements PerformanceMetricStrategy {

	@Override
	public int calculateMetric(List<Double> bids) {
		if (bids.isEmpty()) {
            return 0;
        }

        // Implement your custom metric calculation here
        // For example, calculate the sum of the last 3 bids.
        int sum = 0;
        int count = 0;
        for (int i = bids.size() - 1; i >= 0 && count < 3; i--) {
            sum += bids.get(i);
            count++;
        }
        return sum;
	}

}
