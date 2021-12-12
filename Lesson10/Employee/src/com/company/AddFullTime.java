package com.company;

import java.util.ArrayList;

public class AddFullTime {
public static ArrayList<FullTimeEmployee> getData(){
    ArrayList<FullTimeEmployee> listFullTime = new ArrayList<>();
    listFullTime.add(new FullTimeEmployee("K",100000));
    listFullTime.add(new FullTimeEmployee("Q",300000));
    listFullTime.add(new FullTimeEmployee("J",150000));
    return listFullTime;
}
}
