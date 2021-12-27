package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Service implements IService {
    Scanner sc = new Scanner(System.in);
    Check check = new Check();

    public void Login(ArrayList<Account> list) {
        String name = check.checkUsername(list);
        System.out.print("Nhập Password : ");
        String password = sc.nextLine();
        sc.nextLine();
        Account user = check.checkUserPassword(list, name, password);
        if (user == null) {
            changePassword(list, name);
        } else {
            System.out.println("Đăng nhập thành công!");
            System.out.println("Chào mừng " + name + ", bạn có thể thực hiện các công việc sau: ");
            boolean isCheck = false;
            while (!isCheck) {
                System.out.println("1 - Thay đổi tên tài khoản");
                System.out.println("2 - Thay đổi email");
                System.out.println("3 - Thay đổi mật khẩu");
                System.out.println("4 - Đăng xuất");
                System.out.println("0 - Thoát chương trình");
                System.out.println("Nhập lựa chọn của bạn: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        String name1 = check.checkName(list);
                        user.setName(name1);
                        System.out.println("Thay đổi tên đăng nhập thành công !");
                        break;
                    case 2:
                        String email1 = check.checkEmail(list);
                        user.setEmail(email1);
                        System.out.println("Thay đổi email thành công !");
                        break;
                    case 3:
                        String password1 = check.checkPassword(list);
                        user.setPassword(password1);
                        System.out.println("Thay đổi password thành công !");
                        break;
                    case 4:
                        System.out.println("Đăng xuất thành công !");
                        isCheck = true;
                        break;
                    case 0:
                        System.out.println("Kết thúc chương trình !!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("không có lựa chọn này !!!");

                }
            }
        }
    }

    public void changePassword(ArrayList<Account> list, String name) {
        System.out.println(" Nhập sai Password !!!");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("Nhập lựa chọn của bạn: ");
        boolean isCheck = false;
        while (!isCheck) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Login(list);
                    isCheck = true;
                    break;
                case 2:
                    System.out.print("Nhập email để đổi password: ");
                    Scanner input = new Scanner(System.in);
                    String email = input.nextLine();
                    input.nextLine();
                    int count = 0;
                    for (Account user1 : list) {
                        if (user1.getName().equals(name) && user1.getEmail().equals(email)) {
                            String password1 = check.checkPassword(list);
                            user1.setPassword(password1);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Email không tồn tại");
                    } else {
                        System.out.println("Thay đổi password thành công !");
                    }
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public Account AddNewAccount(ArrayList<Account> list) {
        String name = check.checkName(list);
        String email = check.checkEmail(list);
        String password = check.checkPassword(list);
        Account user = new Account(name, email, password);
        return user;
    }
}
