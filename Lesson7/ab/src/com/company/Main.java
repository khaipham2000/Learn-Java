package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
//Person p = new Person("Khải",21, "HN");
//        System.out.println(p.getName()  + "-"  + p.getAge()  + "-"  + p.getAddress());
//
//        p.setName("Linh");
//        System.out.println(p.getName()  + "-"  + p.getAge()  + "-"  + p.getAddress());

//        ArrayList<String> list = new ArrayList<>();
//        list.add("HTML/CSS");
//        list.add("JS");
//        list.add("Data");
//        list.add("Spring boot");
//
//        System.out.println(list);
//
//        printList(list);
//
//        list.add(1, "java");
//        System.out.println(" danh sach sau khi chen: ");
//        printList(list);
//
//        list.set(1,"java core");
//        System.out.println(" danh sach sau khi sua: ");
//        printList(list);
//
//        list.remove("Data");
//        System.out.println(" danh sach sau khi xoa: ");
//        printList(list);
//
//        list.remove(1);
//        System.out.println(" danh sach sau khi xoa chi muc : ");
//        printList(list);
//
//        System.out.println(" kich thuoc:" + list.size());
//        list.clear();
//        System.out.println(" kich thuoc sau khi xoa :" + list.size());

        ArrayList<Person> listPerson = new ArrayList<>();
        Person p = new Person("J", 21, "HN");
        listPerson.add(p);
        listPerson.add(new Person("Q", 20, "HN"));
        listPerson.add(new Person("K", 25, "HN"));
        listPerson.add(new Person("A", 20, "HN"));
        listPerson.add(new Person("Joker", 30, "HN"));

        for (Person person : listPerson) {
            System.out.println(person);
        }

        System.out.println(" Danh sach nhung nguoi 20 tuoi: ");
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i).getAge() == 20) {
                System.out.println(listPerson.get(i));
            }
        }
//
//   public static void printList(ArrayList<String> list){// tạo phương thức cho java
//        for ( String str: list ){
////            System.out.println(str);
//        }
//    }
    }
}