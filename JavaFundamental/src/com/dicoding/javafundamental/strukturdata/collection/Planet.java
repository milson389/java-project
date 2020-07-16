package com.dicoding.javafundamental.strukturdata.collection;

public class Planet {
    private String name;
    private Double mass;

    public Planet( String name, Double mass ){
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString(){
        return "Planet " + name + ", Mass: " + mass;
    }
}
