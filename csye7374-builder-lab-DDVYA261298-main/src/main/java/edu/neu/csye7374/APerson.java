package edu.neu.csye7374;

public class APerson implements ActivatePersonAPI {
    protected PersonAPI implementor;

    public APerson(PersonAPI implementor) {
        this.implementor = implementor;
    }

    @Override
    public void talk() {
        System.out.println("Hi " + implementor.getName());
    }
}
