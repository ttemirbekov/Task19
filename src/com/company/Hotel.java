package com.company;

import java.util.Arrays;

public class Hotel implements Rental {
    private String address;
    private int price;
    private Person[] person;

    public Hotel(String address, int price, Person[] person) {
        this.address = address;
        this.price = price;
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Hotel\n" +
                "Address: " + address + '\n' +
                "People: " + Arrays.toString(person);
    }

    @Override
    public void toMakePayment() {
        System.out.println("Rental payment: " + price + " soms");
    }
}
