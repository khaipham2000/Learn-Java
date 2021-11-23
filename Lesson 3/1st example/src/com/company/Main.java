package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int age = 10;
      if (age >=18){
          System.out.println(" ban du tuoi bau cu");
          if (age > 150){
              System.out.println(" ban o nha ");
          }
      }
      else { //age < 18
          System.out.println(" ban chua du tuoi ");

      }
        System.out.println(" ket thuc chuong trinh ");

        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap chieu cao");
        double height = sc.nextDouble();
        System.out.println(" nhap can nang");
        double weight = sc.nextDouble();

        double bmi = BMICalculator.bmi(height,weight);

        if (bmi < 18.5){
            System.out.println(" underweight ");
        }
        else if ( bmi >= 18.5 && bmi < 24.9){
            System.out.println(" normal");
        }
        else if ( bmi >= 24.9 && bmi < 29.9){
            System.out.println(" overweight");
        }
    }
}
