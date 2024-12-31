package edu.neu.csye7374;

public class AddressBuilder {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public AddressBuilder setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public AddressBuilder setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Address build() {
        return new Address(streetAddress, city, state, zipCode);
    }

}
