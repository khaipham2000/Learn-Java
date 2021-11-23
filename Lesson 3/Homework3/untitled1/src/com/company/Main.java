package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int aNumber, bNumber, cNumber;
        double nghiem;

        System.out.println("Nhập vào hệ số bậc 2: a=");
        aNumber = sc.nextInt();
        System.out.println("Nhập vào hệ số bậc 1: b=");
        bNumber = sc.nextInt();
        System.out.println("Nhập vào số c=");
        cNumber = sc.nextInt();
        System.out.println(" Phương trình bậc 2 là: "+aNumber +"x^2+" +bNumber +"x+" +cNumber +"=0");

        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                nghiem = (double) -cNumber / bNumber;
                System.out.println("Phương trình có nghiệm x = " +nghiem);
            }
            return;
            }

        float delta = bNumber*bNumber - 4*aNumber*cNumber;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-bNumber + Math.sqrt(delta)) / (2*aNumber));
            x2 = (float) ((-bNumber - Math.sqrt(delta)) / (2*aNumber));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-bNumber / (2 * aNumber));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
