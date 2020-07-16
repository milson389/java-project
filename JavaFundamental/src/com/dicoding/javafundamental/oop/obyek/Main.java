package com.dicoding.javafundamental.oop.obyek;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Hewan Kucing = new Hewan("Kucing");
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();

    }
}
