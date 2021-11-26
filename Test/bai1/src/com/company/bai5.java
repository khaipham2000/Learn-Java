package com.company;

import java.util.Scanner;

public class bai5 {
 public static void Name(){
     System.out.println(" Tên của bạn là:");
     Scanner sc= new Scanner(System.in);
     String name = sc.nextLine();

     name.trim();

     String[] arr = name.split(" ");
     String result = "";
     for (int i = 0; i < arr.length; i++){
         System.out.println(arr[i]);
         result += String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1).toLowerCase() +" ";
     }
     System.out.println(result);
 }
}
