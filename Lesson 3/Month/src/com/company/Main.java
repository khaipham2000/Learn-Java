package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random ran = new Random();
        int randomNumber = ran.nextInt( 12);
        System.out.println( +randomNumber);
        switch (randomNumber){
            case 1,3,5,7,8,10,12:
                System.out.println(" thang co 31 ngay");
                break;
            case 2:
                System.out.println(" thang co 28 hoac 29 ngay");
                break;
            case 4,6,9,11:
                System.out.println(" thang co 30 ngay");
                break;

        }
    }
}
