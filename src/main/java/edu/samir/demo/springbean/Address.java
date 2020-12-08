package edu.samir.demo.springbean;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private int number;
    private String street;
    private int zip;

    public Address() {}

    public Address(int number, String street, int zip) {
        this.number = number;
        this.street = street;
        this.zip = zip;
    }

    public int getNumber() {
        return number;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getZip() {
        return zip;
    }

    public Address setZip(int zip) {
        this.zip = zip;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", zip=" + zip +
                '}';
    }
}
