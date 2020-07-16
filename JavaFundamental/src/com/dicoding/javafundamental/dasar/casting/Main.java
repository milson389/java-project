package com.dicoding.javafundamental.dasar.casting;

public class Main {
    public static void main(String[] args) {
        Cat anggora = new Cat();

        Hewan hewan = anggora; //secara implisit upcasting
        hewan = (Hewan) anggora; //secara explisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Cat();
        ((Cat) hewan2).meow(); //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
