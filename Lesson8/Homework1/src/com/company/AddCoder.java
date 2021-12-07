package com.company;

import java.util.ArrayList;

public class AddCoder {
    static ArrayList<Coder> infor;

    public static ArrayList<Coder> listCoder() {
        infor = new ArrayList<>();
        infor.add(new Coder(05234,"Andrew",24, 0234156,"righthand@gmail.com",10000000,2));
        infor.add(new Coder(01234,"Long",21, 0334156,"short@gmail.com",15000000,1));
        infor.add(new Coder(01244,"Alicia",30, 0134156,"key@gmail.com",12000000,5));
        return infor;
    }
}