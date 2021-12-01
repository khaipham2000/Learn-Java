package com.company;

public class Product {
    public String ID;
    public String name;
    public String describe;
    public int number;
    public int price;
    public String classify;

    public Product(String ID, String name, String describe, int number, int price, String classify) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
        this.number = number;
        this.price = price;
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + ID + ", Tên sản phẩm: " + name + ", Mô tả: " + describe + ", Số lượng: " + number
                + ", Giá bán: " + price + ", Loại sản phẩm: " + classify;
    }
}