package com.company;

public class bai4 {
    public static void songuyento() {
        int n = 10;
        System.out.printf(" 10 số nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i+ "\t");
                count++;
            }
            i++;
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