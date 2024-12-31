package edu.neu.csye7374;




// Decorator for Air Conditioning
public class AirConditioningDecorator extends DecoratorAPI {
    public AirConditioningDecorator(AutoAPI auto) {
        super(auto);
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

    public String getDescription() {
        return super.getDescription() + ", AC: Air Conditioning";
    }
}
