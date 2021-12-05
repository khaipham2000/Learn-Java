package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(-5);
        list.add(4);
        list.add(1000);

        System.out.println(list);
        printList(list);

        list.add(1, -1);
        System.out.println(" danh sach sau khi chen: ");
        printList(list);

        list.remove(3);
    }

    public static void printList(ArrayList<Integer> list){
        for ( Integer str : list){
            System.out.println(str);
        }
    }
}
