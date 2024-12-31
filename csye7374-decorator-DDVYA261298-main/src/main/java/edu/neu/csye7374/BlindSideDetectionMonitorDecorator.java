package edu.neu.csye7374;


// Decorator for Blind-side Detection Monitor
public class BlindSideDetectionMonitorDecorator extends DecoratorAPI {

    public BlindSideDetectionMonitorDecorator(AutoAPI auto) {
        super(auto);
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

    public String getDescription() {
        return super.getDescription() + ", BDM: Blind-side Detection Monitor";
    }
}
