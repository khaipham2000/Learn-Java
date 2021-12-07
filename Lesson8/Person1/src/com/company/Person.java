package com.company;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                " Mã: " + id +
                ", Tên: " + name +
                ", Tuổi: " + age +
                ", Địa chỉ: " + address
                ;
    }

    public void addPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println(" Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println(" Nhap tuoi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println(" Nhap dia chi: ");
        this.address = sc.nextLine();


    }
}
