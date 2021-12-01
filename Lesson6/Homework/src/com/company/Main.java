package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product list[] = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Nhập ID: ");
            String ID = sc.nextLine();
            System.out.println(" Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.println(" Nhập mô tả: ");
            String describe = sc.nextLine();
            System.out.println(" Nhập số lượng: ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println(" Nhập giá bán: ");
            int price = Integer.parseInt(sc.nextLine());
            System.out.println(" Nhập loại sản phẩm: ");
            String classify = sc.nextLine();

            Product s = new Product(ID, name, describe, number, price, classify);
            list[i] = s;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(list[i].name.contains(findName)){
                System.out.println(list[i]);
            }
        }

    }
    }
