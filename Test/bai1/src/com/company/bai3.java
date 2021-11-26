package com.company;

import java.util.Random;


public class bai3 {
    public static void randomNumber() {
        Random ran = new Random();
        int number1 = ran.nextInt(20);
        System.out.println(" Số ngẫu nhiên là: " + number1);


        if (isPrimeNumber(number1)) {
            System.out.println(" %d là số nguyên tố:" + number1);
        } else {
            System.out.println(" Đây không là số nguyên tố " + number1);

        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
