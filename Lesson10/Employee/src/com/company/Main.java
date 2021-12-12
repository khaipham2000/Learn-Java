package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<FullTimeEmployee> dataFullTime = AddFullTime.getData();
        System.out.println(" Danh sách Lập trình viên : " + "\n");
        for(FullTimeEmployee sub: dataFullTime ){
            System.out.println(sub);
        }
    }
}
