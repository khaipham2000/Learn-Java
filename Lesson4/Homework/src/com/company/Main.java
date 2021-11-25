package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap kich thuoc mang: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf(" Nhap phan tu vi tri %d: ", i);
            arr[i] = sc.next();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].contains("Java")) {
                count++;
            }
        }
        System.out.println("Số lần Java có trong mảng = " + count);

        int Position = 0;
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String strRandom = sc.next();
        for (int i = 0; i < n ; i++)
        {
            if (strRandom.equals(arr[i]))
            {
                Position++;
                System.out.println("Chuỗi vừa nhập nằm ở vị trí: " + i);
            }
        }
        if( Position == 0)
        {
            System.out.println("Chuỗi vừa nhập không có trong mảng");
        }

    }
}
