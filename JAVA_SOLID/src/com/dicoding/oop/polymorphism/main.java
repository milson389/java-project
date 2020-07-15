package com.dicoding.oop.polymorphism;

public class main {
    //runtime polymorphism
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.walk();

        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(5,3));
    }
}

class Animal{
    public void walk(){
        System.out.println(getClass().getSimpleName() + "walk!");
    }
}

class Cat extends Animal{
    @Override
    public void walk() {
        super.walk();
        System.out.println("Yeay!" + getClass().getSimpleName() + "walked!");
    }
}
