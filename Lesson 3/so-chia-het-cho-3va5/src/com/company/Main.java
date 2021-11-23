package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // các số chia hết cho 3, 5 và cả 3 và 5
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else{
//                if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }
//
//        }

// int sum = 0;// vòng lặp tổng từ 0 đến 10
//  int i =0;
//while (i<=10){
//    sum= sum +i;
//     i++;
////    System.out.println(sum); de trong vong lap thi in lap tung cap
//}  System.out.println(sum);

//    int count = 0;// đếm số vòng lặp từ 0 đến 10 chia hết cho 2
//    int i =0;
//    while (i<=10){
//        if(i%2==0){
//            count++;
//        }
//        i++;
//    }
//        System.out.println(count);

// vong lap scanner so kiem tra tuoi bau cu
//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//        boolean isCheck = false;
//
//       while(!isCheck){
//            System.out.println(" nhap so bat ky: ");
//            number = sc.nextInt();
//            if (number < 0){
//                System.out.println(" ban nhap so am ");
//            }else if( number > 0 && number < 18){
//                System.out.println(" ban chua du tuoi bau cu");
//            }else if( number >= 18 && number < 100){
//                System.out.println(" ban du tuoi bau cu ");
//            }else if(number == 0){
//    isCheck = true;
//            }else {
//                System.out.println(" ban lon tuoi qua r");
//            }
//
//            }
//        System.out.println(" nhap 1 so bat ky ");


        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isCheck = false;
        Random ran = new Random();
        int randomNumber = ran.nextInt( 100);
        System.out.println( +randomNumber);

       while(!isCheck){
          System.out.println(" nhap so bat ky: ");
            number = sc.nextInt();
        int i =0;
        while (!isCheck){
            if (i < randomNumber){
                System.out.println(" i nho hon");
            }else if( i > randomNumber){
                System.out.println(" i lon hon");
            }
        }
    }
}

