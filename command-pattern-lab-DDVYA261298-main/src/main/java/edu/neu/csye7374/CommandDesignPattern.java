package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class CommandDesignPattern {
    public static class Calculator {
        private List<Calculate> commandList = new ArrayList<>();

        public void addCommand(Calculate command) {
            commandList.add(command);
        }

        public void executeCommands() {
            for (Calculate command : commandList) {
                command.execute();
            }
        }
    }

    interface Calculate {
        void execute();
    }

    static class Addition implements Calculate {
        private int a;
        private int b;

        private CalculatorReceiver calculator=new CalculatorReceiver();

        public Addition(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void execute() {
            calculator.add(a,b);
        }
    }

    static class Subtraction implements Calculate {
        private int a;
        private int b;
        private CalculatorReceiver calculator=new CalculatorReceiver();

        public Subtraction(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void execute() {
            calculator.subtract(a,b);
        }
    }

    static class Multiply implements Calculate {
        private int a;
        private int b;
        private CalculatorReceiver calculator=new CalculatorReceiver();

        public Multiply(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void execute() {
            calculator.multiply(a,b);
        }
    }

    static class Divide implements Calculate {
        private int a;
        private int b;
        private CalculatorReceiver calculator=new CalculatorReceiver();

        public Divide(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void execute() {
            calculator.divide(a,b);
        }
    }

    static class Sum implements Calculate {
        private double[] values;
        private CalculatorReceiver calculator=new CalculatorReceiver();

        public Sum(double[] values) {
            this.values = values;
        }

        @Override
        public void execute() {
            calculator.sum(values);
        }
    }

    public static class CalculatorReceiver {
        public double add(double a, double b) {
            double result = a + b;
            System.out.println(result);
            return result;
        }

        public double subtract(double a, double b) {
            double result = a - b;
            System.out.println(result);
            return result;
        }

        public double multiply(double a, double b) {
            double result = a * b;
            System.out.println(result);
            return result;
        }

        public double divide(double a, double b) {
            double result = a / b;
            System.out.println(result);
            return result;
        }

        public double sum(double... numbers) {
            double result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result += numbers[i];
            }
            System.out.println(result);
            return result;
        }
    }
    public static void demo() {
        Calculator calculator = new Calculator();
        calculator.addCommand(new Addition(6, 3));
        calculator.addCommand(new Subtraction(6, 3));
        calculator.addCommand(new Multiply(6, 3));
        calculator.addCommand(new Divide(6, 3));
        calculator.addCommand(new Sum(new double[]{1, 2, 3, 4}));
        calculator.executeCommands();
    }
}
