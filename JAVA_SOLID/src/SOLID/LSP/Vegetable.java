package SOLID.LSP;

import SOLID.SRP.FoodExpiry;

import java.util.Date;

public class Vegetable extends FoodProduct {
    @Override
    String setName() {
        return "Brocoli";
    }

    /**
     * Liskov's Substitution Principle
     * aturan yang berlaku untuk hirarki pewarisan
     * class harus menerapkan fungsi dan properti superclassnya
     * */

    @Override
    Date setExpiredDate() {
        return new Date();
    }
}
