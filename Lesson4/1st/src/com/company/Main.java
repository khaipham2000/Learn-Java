package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        String[] strArray = new String[3];
//        strArray[0] = "Java";
//        strArray[1] = "HTML";
//        strArray[2] = "JS";
//
//        System.out.println(" kich thuoc mang " + strArray.length);
//
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//
//        // tìm vị trí của phần tử
//        for (int i = 0; i < strArray.length; i++) {
//            if (strArray[i].equals("JS")) {
//                System.out.println(" chi muc cua JS " + i);
//            }
//        }
//
//        for (int i = 0; i < strArray.length; i++){// tìm phần tử có chứa kí tự
//            if (strArray[i].contains("a")){
//                System.out.println(" phan tu co chua chu a la: " +strArray[i]);
//            }
//        }

        // tạo mảng số nguyên n phần tử
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập kích thước mảng: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.printf(" nhap phan tu vi tri %d:", i);
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(" mang vua nhap la: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println(" su dung for each duyet mang: ");
//        for(int i: arr){
//            System.out.println(arr[i]);
//        }
        MinMax.minmax();
    }
}
