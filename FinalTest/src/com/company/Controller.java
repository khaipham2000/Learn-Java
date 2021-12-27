package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void Menu() {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();

        ArrayList<Account> list = Repository.getAccount();
        boolean isCheck = false;
        while (!isCheck) {
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng kí");
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.Login(list);
                    break;
                case 2:
                    list.add(service.AddNewAccount(list));
                    System.out.println("Tạo tài khoản thành công! ");
                default:
                    System.out.println("không có lựa chọn này! ");
            }
        }
    }
}
