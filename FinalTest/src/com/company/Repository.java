package com.company;

import java.util.ArrayList;

public class Repository {
    public static ArrayList<Account> getAccount() {
        ArrayList<Account> list= new ArrayList<>();
        list.add(new Account("JohnCena","0p23456H*11", "cena@gmail.com"));
        list.add(new Account("JohnWick","27W031jk7#12", "wick007@gmail.com"));
        list.add(new Account("JohnConstantine","Jc167345$191315", "Constantine6@gmail.com"));
        list.add(new Account("JohnTerry","Terry7121980#15", "terrychexanh@gmail.com"));
        list.add(new Account("JohnHenry","98JQK00i#11", "henrry@gmail.com"));

        return list;
    }


}
