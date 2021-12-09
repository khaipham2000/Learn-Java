package com.company;

public abstract class Shape {
    public void draw(){
        System.out.println(" Hinh j do");
    }

    public final void getName(){// co final thi ko goi dc trong phuong thuc con
        System.out.println(" day la hinh ");
    }

    public abstract void setArea();
}
