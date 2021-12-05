package com.company;

public class Product {
    private String ID;
    private String name;
    private String describe;
    private int number;
    private long price;
    private String classify;

    public Product(String ID, String name, String describe, int number, long price, String classify) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
        this.number = number;
        this.price = price;
        this.classify = classify;
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getDescribe(){
        return describe;
    }
    public int getNumber(){
        return number;
    }
    public long getPrice(){
        return price;
    }
    public String getClassify(){
        return classify;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + ID + ", Tên sản phẩm: " + name + ", Mô tả: " + describe + ", Số lượng: " + number
                + ", Giá bán: " + price + ", Loại sản phẩm: " + classify;
    }
}
