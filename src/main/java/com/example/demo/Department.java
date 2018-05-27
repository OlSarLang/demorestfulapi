package com.example.demo;

import java.util.ArrayList;

public class Department {
    String name;
    int id;

    public Department() {
    }

    public Department(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
