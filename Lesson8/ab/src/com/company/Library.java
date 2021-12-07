package com.company;

public class Library {
    private int id;
    private String name;
    private String producer;
    private int year;
    private int number;

    public Library(int id, String name, String producer, int year, int number) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return
                 id + "-"
                + name + "-" + producer + "-"
                + year + "-"
                 + number + "-"
                ;
    }
}
