package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Coder> dataCoder = AddCoder.listCoder();
        System.out.println(" Danh sách Lập trình viên : " + "\n");
        for(Coder sub: dataCoder ){
            System.out.println(sub);
        }

        System.out.println("------------------------");

        ArrayList<Checker> dataChecker = AddChecker.listChecker();
        System.out.println(" Danh sách Kiểm chứng viên: " + "\n");
        for(Checker sub: dataChecker ){
            System.out.println(sub);
        }
    }
}
