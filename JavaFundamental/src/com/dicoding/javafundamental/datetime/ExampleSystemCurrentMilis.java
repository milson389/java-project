package com.dicoding.javafundamental.datetime;

import java.util.Calendar;
import java.util.Date;

public class ExampleSystemCurrentMilis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();
        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");

        Date date = new Date();
        System.out.println("Tanggal sekarang adalah " + date.toString());

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

    }
}
