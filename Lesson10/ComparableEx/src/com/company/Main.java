package com.company;

import java.util.ArrayList;
import java.util.Collections;

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

        Collections.sort(listPerson);
        System.out.println(" Danh sách sau khi sắp xếp: ");
        show(listPerson);
    }

    public static void show (ArrayList<Person> listPerson){
        for( Person p: listPerson){
            System.out.println(p);
        }
    }
}
