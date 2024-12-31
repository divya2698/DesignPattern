package edu.neu.csye7374;

public class DecoratorAPI implements AutoAPI{
    protected AutoAPI auto;

    public DecoratorAPI(AutoAPI auto) {
        this.auto = auto;
    }
    
    @Override
    public int getPrice() {
        return auto.getPrice();
    }

    @Override
    public String getDescription() {
        return auto.getDescription();
    }   
}
