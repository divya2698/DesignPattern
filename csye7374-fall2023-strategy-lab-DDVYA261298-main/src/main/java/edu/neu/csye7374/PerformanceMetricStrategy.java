package edu.neu.csye7374;
import java.util.List;

public interface PerformanceMetricStrategy {
	int calculateMetric(List<Double> bids);
}
