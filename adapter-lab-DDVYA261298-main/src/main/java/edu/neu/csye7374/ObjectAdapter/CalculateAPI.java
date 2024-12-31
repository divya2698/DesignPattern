package edu.neu.csye7374.ObjectAdapter;

public interface CalculateAPI {
    enum OPERATION {ADD, SUB, MULT, DIV}
    double operation(OPERATION op, double a, double b);
}
