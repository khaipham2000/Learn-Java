package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
   int arr[][] = new int[3][2];
   arr[0][0] = 1;// dọc 0, ngang 0
   arr[0][1] = 3;// dọc 0, ngang 1
   arr[1][0] = 7;
   arr[1][1] = 2;
   arr[2][0] = 9;
   arr[2][1] = 5;

   for (int i=0; i< arr.length; i++){
       for (int j=0; j< arr[i].length; j++){
           System.out.print(arr[i][j] + "\t");
       }
       System.out.println();
   }
    }
}
