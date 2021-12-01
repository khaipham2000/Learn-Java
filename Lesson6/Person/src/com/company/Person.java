package com.company;

import java.util.Scanner;

public class Person {

    public Person(String name, int age, String address) {

    }

    public static void people(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so hoc sinh");
        int n = sc.nextInt();
        sc.nextLine();

        Person persons[] = new Person[n];
        for (int i = 0; i<n; i++){
            System.out.println(" nhap ten: ");
            String name = sc.nextLine();
            System.out.println(" nhap tuoi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println(" dia chi: ");
            String address = sc.nextLine();

            Person p = new Person(name, age, address);
            persons[i] = p;
        }

        for (int i = 0; i<n; i++){
            System.out.println();
        }

    }
//    public String name;
//    public int age;
//    public String address;
//
// public static String school = "Tech";
//
// public static void changeSchool(){
//     school=" CNTT ";
// }
//    // tao constructor mac dinh
//    public Person(){
//        System.out.println(" goi toi con structor mac dinh");
//    }

    // tao constructor co tham so
//    public Person(String ten, int tuoi, String diachi){
//        name = ten;
//        age = tuoi + 3;
//        address = diachi;
//    }
// alt + insert ọn all tổ hợp ctrl+a
//   public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
//
//
//
//    public void study(){
//        System.out.println(" di hoc ");
//
//    }
//
//    @Override// nhấn to
//    public String toString() {
//        return name + "-" + age +"-" + address + "-" + school;


    }

