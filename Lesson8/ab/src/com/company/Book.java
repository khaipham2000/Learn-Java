package com.company;

import java.util.ArrayList;

public class Book {
    static ArrayList<SchoolBook> infor;

    public static ArrayList<SchoolBook> list(){
     infor = new ArrayList<>();
     infor.add(new SchoolBook(1," 1000 Nights "," Disney ",2000,10,100," ngguyen ven ",2));
        infor.add(new SchoolBook(2," Green Book "," Fox ",2010,33,130," mat ",2));
        infor.add(new SchoolBook(3," La La La "," Marvel ",2008,99,1000," rach ",2));
        return infor;
    }
}
