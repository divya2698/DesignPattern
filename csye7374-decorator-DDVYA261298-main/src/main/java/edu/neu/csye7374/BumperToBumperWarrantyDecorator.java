package edu.neu.csye7374;


// Decorator for Bumper to Bumper Warranty
public class BumperToBumperWarrantyDecorator extends DecoratorAPI {

    public BumperToBumperWarrantyDecorator(AutoAPI auto) {
        super(auto);
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

    public String getDescription() {
        return super.getDescription() + ", BB: Bumper to Bumper Warranty";
    }
}