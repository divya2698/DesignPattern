package edu.neu.csye7374;



// Decorator for All Wheel Drive
public class AllWheelDriveDecorator extends DecoratorAPI {

    public AllWheelDriveDecorator(AutoAPI auto) {
        super(auto);
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

    public String getDescription() {
        return super.getDescription() + ", AWD: All Wheel Drive";
    }
}