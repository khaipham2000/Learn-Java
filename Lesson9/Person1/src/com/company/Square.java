package com.company;

public class Square extends Shape  {
private int a;

    public void draw() {
        super.draw();
        System.out.println
                (" Hình vuông!!!");
    }

    public Square(int a) {
        this.a = a;
    }

    @Override
public  void setArea(){
    System.out.println(" tinh s :"+ a*a);
        System.out.println(" tinh chu vi: "+ a*4);
}
}
