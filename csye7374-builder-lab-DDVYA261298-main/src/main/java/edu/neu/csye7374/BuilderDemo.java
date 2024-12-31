package edu.neu.csye7374;

public class BuilderDemo {
    public static void  demo(){
    	System.out.println();
        System.out.println("BuilderDesignPattern Demo");
        System.out.println("-------------------------");
        AddressBuilder builder = new AddressBuilder();
        Address address = builder.setStreetAddress("36 Addington street").setCity("Boston").setState("MA").setZipCode("02120").build();
        System.out.println("Street Address: " + address.getStreetAddress());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Zip Code: " + address.getZipCode());
    }
}
