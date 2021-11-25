package com.company;

import java.util.Scanner;

public class MinMax {
    public static void minmax() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf(" nhap phan tu vi tri %d:", i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];// gán nó ở vị trí = 0
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(" gia tro nho nhat la: ");
    }
}


