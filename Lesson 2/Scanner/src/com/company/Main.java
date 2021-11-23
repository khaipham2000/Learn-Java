package com.company;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Scanner sc = new Scanner(System.in);
//
//        System.out.println(" nhập tên bạn: ");
//        String name = sc.nextLine();;
//        System.out.println(" tên bạn là " + name);
//
//        System.out.println(" nhập tuổi bạn: ");
//        int number = sc.nextInt();
//        System.out.println(" tuổi bạn là " + number);
//
//        sc.nextLine();// chuyển từ scan số sang chuỗi
//        System.out.println(" địa chỉ: ");
//        String address = sc.nextLine();;
//        System.out.println(" địa chỉ bạn là " + address);
//
//        System.out.println(" nhập số thực: ");
//        Double number2 = sc.nextDouble();
//        System.out.println(" số vừa nhập " + number2);

       System.out.printf(" tôi tên là %s, năm nay tôi %d, tôi đến từ %s", "khải", 21, "hà nội");

       String name = "khải";
       int age = 21;
       String address = "hanoi";
      System.out.printf(" tôi tên là %s, năm nay tôi %d, tôi đến từ %s", name, age, address);// f dùng full  ,
        System.out.println(" tôi tên là" + name);// ln dùng cả cộng

        double weight = 70.1;
        System.out.printf(" cân nặng \n là %.2f", weight);

        double height = 1.75;
        double bmi = weight/(Math.pow(height,2));
        System.out.printf( "chỉ số bmi la %.2f", bmi);
        System.out.println("làm tròn" +Math.ceil(bmi));

        Random ran = new Random();
        int randomNumber = ran.nextInt( 20);
        System.out.println( +randomNumber);


    }
}
