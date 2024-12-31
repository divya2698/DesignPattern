package edu.neu.csye7374;


// Decorator for Anti-lock Braking System
public class AntiLockBrakingSystemDecorator extends DecoratorAPI {

    public AntiLockBrakingSystemDecorator(AutoAPI auto) {
        super(auto);
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

    public String getDescription() {
        return super.getDescription() + ", ABS: Anti-lock Braking System";
    }
}

