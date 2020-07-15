package com.dicoding.oop.inheritance.multilevel;

public class Animal {
    public void walk(){
        System.out.println(getClass().getSimpleName() + "walk!");
    }
}

class Carnivore extends Animal{
    public void eat(){
        System.out.println("Yeay!" + getClass().getSimpleName() + "eat!");
    }
}

class Cat extends Carnivore{
    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
}