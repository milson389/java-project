package com.dicoding.generalization;

abstract class Product {
    private String id;
    private String name;
    private String price;

    public Product(String id, String name, String price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ElectronicProduct extends Product{
    private String id;
    private String name;
    private String price;
    private String productionDate;

    public ElectronicProduct(String id, String name, String price, String productionDate) {
        super(id, name, price);
        this.id = id;
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
    }
}

class ConsumableProduct extends Product{
    private String id;
    private String name;
    private String price;
    private String expirationDate;

    public ConsumableProduct(String id, String name, String price, String expirationDate) {
        super(id, name, price);
        this.id = id;
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }
}
