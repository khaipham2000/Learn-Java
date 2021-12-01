package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so hoc sinh");
        int n = sc.nextInt();
        sc.nextLine();

        Student list[] = new Student[n];

        for (int i = 0; i < n; i++){
            System.out.println(" nhap id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println(" nhap ten: ");
            String name = sc.nextLine();
            System.out.println(" nhap diem ly thuyet: ");
            int score1 = Integer.parseInt(sc.nextLine());
            System.out.println(" nhap diem thuc hanh: ");
            int score2 = Integer.parseInt(sc.nextLine());

            Student s = new Student(id, name, score1, score2);// tạo đối tượng mới
            list[i] = s;// gán đối tượng mới cho mảng ở vị trí i
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);


        }
    }
}