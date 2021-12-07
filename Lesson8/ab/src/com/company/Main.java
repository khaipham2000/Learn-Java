package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<SchoolBook> listBook = Book.list();
        System.out.println("Danh sách book: " + "\n");
         for(SchoolBook sub: listBook ){
         System.out.println(sub+ "\n");
}
        }
}
