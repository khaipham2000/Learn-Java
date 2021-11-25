package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap kich thuoc mang: ");
        int n = sc.nextInt();
        int [] strArray = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf(" Nhap phan tu vi tri %d: ", i);
            strArray[i] = sc.nextInt();
        }
        for ( int i =0; i <n; i++){
            for ( int j = i+1; j<n; j++){
                if ( strArray[i] > strArray[j]){
                    int temp = strArray[i];// temp là giá trị trung gian nếu temp>i thì i thành j, j thành temp
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                    System.out.println(temp + "" + strArray[i] +strArray[j] );
                }
            }
        }
        System.out.println("mang sau khi sap xep la: ");
        for (int i =0; i<n; i++){
            System.out.println(strArray[i]);
        }
    }
}
