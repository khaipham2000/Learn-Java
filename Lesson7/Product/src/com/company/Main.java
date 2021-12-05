package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList <Product> listProduct =new ArrayList<>();
        Product p = new Product("P123", "Milo", "Milk", 100, 10000, "VN");
        listProduct.add(p);
        listProduct.add(new Product("p142", "Omo"," Bot giat", 47, 34000,"VN"));
        listProduct.add(new Product("p142", "Lavie"," Water", 150, 45000,"VN"));
        listProduct.add(new Product("p142", "coco"," Cookies", 25, 25000,"VN"));

        for (Product product : listProduct) {
            System.out.println(product);
        }

        System.out.println(" Danh sach hang hoa tu 100 sp tro len: ");
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getNumber() >= 100) {
                System.out.println(listProduct.get(i));
            }
        }

    }
}
