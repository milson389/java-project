package com.dicoding.javafundamental.oop.propertimetode;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Hewan(2);
        Kucing.makan();
        Kucing.jalan();
        Kucing.lari();

        System.out.println("Umurnya adalah : " + Kucing.getUmur());
        double bmi = Kucing.getBerat() / ( ( Kucing.getTinggi() * 0.01 ) * ( Kucing.getTinggi() * 0.01 ));
        System.out.println("Indeks massa tubuhnya adalah " + new DecimalFormat("00.00").format(bmi) );
    }
}
