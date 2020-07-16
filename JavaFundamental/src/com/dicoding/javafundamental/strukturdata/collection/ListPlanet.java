package com.dicoding.javafundamental.strukturdata.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("\nList Planet Awal: ");
        for (int i = 0; i < planets.size(); i++){
            // method get() untuk melihat isi list pada index i
            System.out.println("\t index - " + i + " = " + planets.get(i));
        }

        planets.remove("venus"); // menghapus venus dari list

        System.out.println("\nList Planet Akhir: ");
        for (int i = 0; i < planets.size(); i++){
            // method get() untuk melihat isi list pada index i
            System.out.println("\t index - " + i + " = " + planets.get(i));
        }


    }
}
