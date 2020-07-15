package com.dicoding.oop.polymorphism;

public class Arithmetic {
    //compile time
    // parameter type

    public int add ( int valueA, int valueB){
        return valueA + valueB;
    }

    public long add ( long valueA, long valueB){
        return valueA + valueB;
    }

    public long add( int valueA, long valueB){
        return valueA + valueB;
    }

    public long add(long valueA, int valueB){
        return valueA + valueB;
    }
}

//parameter count di mana sebuah fungsi yang dapat memiliki nama yang sama namun jumlah parameter yang berbeda

class Add extends Arithmetic{
    @Override
    public int add(int valueA, int valueB) {
        System.out.println("Calculate!");
        return super.add(valueA, valueB);
    }
}
