package com.dicoding.oop.inheritance.single;

public class Cat extends Animal{
    @Override
    public void walk(){
        System.out.println("Yeay! " + getClass().getSimpleName() + " walk!");
    }
}
