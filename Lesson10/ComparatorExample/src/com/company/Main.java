package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Person> listPerson =new ArrayList<>();
        listPerson.add(new Person("John",17,"US"));
        listPerson.add(new Person("Anna",20,"Mexico"));
        listPerson.add(new Person("Chris",17,"US"));
        listPerson.add(new Person("Victor",19,"US"));

        System.out.println(" Danh sach ban đầu: ");
        show(listPerson);

        // sắp xếp theo tên
//        Collections.sort(listPerson, new Comparator<Person>() {
//            @Override// lớp vô danh
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(" Danh sách sắp xếp theo tên: ");
//        show(listPerson);

        // sắp xếp theo tuổi
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override// lớp vô danh
            public int compare(Person o1, Person o2) {
                return o1.getAge() - (o2.getAge());
            }
        });
        System.out.println(" Danh sách sắp xếp theo tuổi: ");
        show(listPerson);
    }

    public static void show (ArrayList<Person> listPerson){
        for( Person p: listPerson){
            System.out.println(p);
        }
    }
}
