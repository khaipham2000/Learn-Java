package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

//        System.out.println(" nhập số: ");
//        int number1 = sc.nextInt();
//        System.out.print(" Nhập số " + number1);
//
//        int number2 = ran.nextInt( 20);
//        System.out.println( "Số ngẫu nhiên " +number2);
//        int max = Math.max(number1,number2);
//        System.out.println(" số lớn nhất: " +max); // chọm số lớn nhất

        int randomnumber = ran.nextInt(20);
        String resource = (randomnumber % 2 == 0) ? randomnumber + " là số chẵn " : randomnumber + " là số lẻ ";
        System.out.println(resource);
    }
}
