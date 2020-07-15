package com.dicoding.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private List data = new ArrayList();

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
