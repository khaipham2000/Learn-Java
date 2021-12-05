package com.company;

public class Person {

    private  String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }
    public int getAge(){
        return age;
    }
    public void setAge( int age){
        if (age > 0 && age < 100){
            this.age = age;
        }

    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {// apply to add.new
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}


