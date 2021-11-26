package com.company;

import java.util.Scanner;

public class bai6 {
    public static void multiArray(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số hàng và cột của ma trận : ");
        int row = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[row][row];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print("Nhập phần tử : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Đường chéo chính : ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < row ; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }

        }

    }
}
