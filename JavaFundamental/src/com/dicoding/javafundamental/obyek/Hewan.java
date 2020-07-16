package com.dicoding.javafundamental.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    public Hewan( String namaHewan ){
        nama = namaHewan;
    }

    public void beratHewan( int beratHewan ){
        berat = beratHewan;
    }

    public void jumlahKakiHewan( int jumlahKakiHewan ){
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " +  berat);
        System.out.println("Jumlah kaki : " + jumlahKaki);
        System.out.println();
    }
}
