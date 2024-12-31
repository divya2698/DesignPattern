package edu.neu.csye7374;

import java.util.HashMap;

public class MyCloneable implements Cloneable{
    private int id;
    private double price;
    private String name;

    protected MyCloneable(Builder builder) {
        this.id = builder.id;
        this.price = builder.price;
        this.name = builder.name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private int id;
        private double price;
        private String name;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public MyCloneable build() {
            return new MyCloneable(this);
        }
    }


    public MyCloneable clone() throws CloneNotSupportedException {
        return (MyCloneable) super.clone();
    }

    public static void demo() {
        MyCloneableAbstractFactorySingleton factory = MyCloneableAbstractFactorySingleton.getInstance();
        HashMap<Integer, MyCloneable> prototypes = new HashMap<>();

        // Create 26 prototypes
        for (int i = 1; i <= 26; i++) {
            prototypes.put(i, new MyCloneableItem.Builder()
                    .setId(i)
                    .setPrice((i-1) + 1.99)
                    .setName(String.valueOf((char) (i + 64)))
                    .build());
        }

        // Load the prototypes into the factory
        factory.load(prototypes);

        // Use the factory to get and clone objects
        for (int i = 1; i <= 26; i++) {
            MyCloneable item = factory.getObject(i);
            System.out.println("Item ID: " + item.getId());
            System.out.println("Item " + item.getName() + " Sold for " + item.getPrice());
            System.out.println();
        }
    }
}
