package com.dicoding.javafundamental.accessmodifier.package4;

import java.io.Serializable;

public class Lingkaran {
    static final double PI = 3.141;

    int jari = 7;

    final double getLuas(){
        return PI * ( jari * jari );
    }
}

class Test implements Serializable{
    // Serialisasi merupakan proses konversi suatu objek menjadi byte agar dapat ditransmisikan

    transient int nilaiA; // variable ini tidak akan dijaga nilainya

    // variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;

    public synchronized void showData(){
        // modifier ini digunakan untuk membatasi akses ke suatu variable.methods yang hanya boleh dilakukan
        // oleh 1 thread
    }
}

