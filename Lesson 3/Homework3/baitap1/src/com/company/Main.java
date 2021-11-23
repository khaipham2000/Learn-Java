package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int aNumber, bNumber;
        double nghiem;

        System.out.println("Nhập vào số a: ");
        aNumber = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = sc.nextInt();
        System.out.println(" Phương trình bậc nhất là: " + aNumber + "x + " + bNumber + " = 0");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;


            System.out.println("Phương trình có nghiệm x = " + nghiem );
        }
    }
}
