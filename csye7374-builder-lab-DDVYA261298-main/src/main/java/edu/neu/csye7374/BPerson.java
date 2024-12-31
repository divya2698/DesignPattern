package edu.neu.csye7374;

public class BPerson extends APerson implements AmbulatePersonAPI {
    public BPerson(PersonAPI implementor) {
        super(implementor);
    }

    @Override
    public void play() {
        System.out.println(implementor.getName() + " is playing");
    }

    @Override
    public void sleep() {
        System.out.println(implementor.getName() + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(implementor.getName() + " is eating");
    }
}
