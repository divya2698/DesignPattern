package edu.neu.csye7374.ObjectAdapter;

import java.util.List;

public class CalculatorAdapter implements AccumulateAPI {
    private double sum;
    private final CalculateAPI calculator;

    public CalculatorAdapter(CalculateAPI calculator) {
        this.calculator = calculator;
        this.sum = 0;
    }

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double itemPrice : prices) {
            sum = calculator.operation(CalculateAPI.OPERATION.ADD, sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return calculator.operation(CalculateAPI.OPERATION.SUB, cash, sum);
    }
}
