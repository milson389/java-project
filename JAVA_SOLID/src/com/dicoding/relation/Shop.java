package com.dicoding.relation;

public class Shop {
    /* Agregasi
     *  class yang memiliki diberi simbol diamond
     *  misal class shop memiliki class seller
     *  tanpa shop class seller masih bsa digunakan
     *  tapi tanpa seller class shop tidak relevan lagi
     * */

    /* Komposisi
     *  sama seperti agregasi hanya saja yang membedakan
     *  jika komposisi maka jika class yang memilki dihancurkan
     *  maka class yang dimiliki juga dihancurkan karena komposisi
     *  bersifat terikat
     * */

    private String id;
    private String name;
    private Seller seller;


    public Shop(String id, String name){
        this.id = id;
        this.name = name;
    }

    public final Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}

