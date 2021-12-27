package com.company;

import java.util.ArrayList;

public interface IService {
    public void Login(ArrayList<Account> list);
    public void changePassword(ArrayList<Account> list, String name);
    public Account AddNewAccount(ArrayList<Account> list);
}
