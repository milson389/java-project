package com.dicoding.javafundamental.strukturdata.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

        System.out.println("Set planets awal: (size = " + planets.size() + ")");

        // Untuk menampilkan isi Set
        for (String planet : planets ){
            System.out.println("\t " + planet);
        }

        // untuk menghapus objek dari set
        planets.remove("venus");

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("\t " + iterator.next());
        }
    }
}
