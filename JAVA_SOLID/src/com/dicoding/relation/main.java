package com.dicoding.relation;

public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("1234", "Audie Milson", new Address("123", "Jakarta"));
    }
}

class Customer{
    private String id;
    private String name;
    private Address address;

    public Customer(String id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

class Address {
    private String id;
    private String location;

    public Address(String id, String location){
        this.id = id;
        this.location = location;
    }
}
