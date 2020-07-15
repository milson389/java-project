package com.dicoding.relation;

import java.util.List;

public class Toko {

}

class Seller{
    private String id;
    private String name;
}

class User{
    private String id;
    private String name;
    private List<Seller> sellers;
}
