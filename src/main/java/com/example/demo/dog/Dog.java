package com.example.demo.dog;

public class Dog {
    private String name;
    private String size;
    private String hairColor;

    public Dog(String name, String size, String hairColor) {
        this.name = name;
        this.size = size;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
