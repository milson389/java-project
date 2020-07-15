package com.dicoding.oop.basic;

public class kucing {
    private String color;
    private Double height;
    private Double length;
    private Double weight;

    public void purring(){
        System.out.println("meow...");
    }

    public void eat(){
        weight+=1;
    }

    public kucing(){

    }

    public kucing(String color, Double height, Double length, Double weight){
        this.color = color;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public String getColor() {
            return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}

