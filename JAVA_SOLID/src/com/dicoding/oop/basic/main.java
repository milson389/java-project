package com.dicoding.oop.basic;

public class main {
    public static void main(String[] args) {
        kucing persian = new kucing();
        persian.setColor("Putih");
        persian.setHeight(24.0);
        persian.setLength(46.0);
        persian.setWeight(2.0);
        persian.purring();

        kucing bengal = new kucing("Coklat", 22.0, 39.0, 2.3);
        kucing anggora = new kucing("Abu-abu", 25.0, 41.0, 2.4);
    }
}
