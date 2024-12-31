package edu.neu.csye7374.ClassAdapter;

import java.util.List;

public class CalculatorAdapter implements AccumulateAPI, CalculateAPI {
    private double sum;

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double itemPrice : prices) {
            sum = operation(OPERATION.ADD, sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return operation(OPERATION.SUB, cash, sum);
    }

    @Override
    public double operation(OPERATION op, double a, double b) {
        switch (op) {
            case ADD:
                return a + b;
            case SUB:
                return a - b;
            case MULT:
                return a * b;
            case DIV:
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }
}