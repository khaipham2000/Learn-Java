package com.company;

public class Dog {
public String breed;
public String size;
public int age;
public String color;

    @Override
    public String toString() {
        return breed + "-" + size + "-" + age +"-" + color;
    }
    public Dog (String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
}
