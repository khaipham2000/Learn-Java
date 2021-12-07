package com.company;

import java.util.ArrayList;

public class AddChecker {
    static ArrayList<Checker> data;

    public static ArrayList<Checker> listChecker(){
    data = new ArrayList<>();
    data.add(new Checker(13562,"Fred",19, 2354671,"kosaymen@gmail.com",8000000,9));
    data.add(new Checker(13562,"Paul",27, 2354555,"paul@gmail.com",17000000,5));
    data.add(new Checker(13562,"Tony",39, 2353291,"banla@gmail.com",20000000,2));
    return data;
    }
}
