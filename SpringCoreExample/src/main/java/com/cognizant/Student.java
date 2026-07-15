package com.cognizant;

public class Student {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Address: " + address.getAddress());
    }
}