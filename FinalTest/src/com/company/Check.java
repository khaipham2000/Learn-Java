package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {

    public String checkUsername(ArrayList<Account> list) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        boolean isCheck = false;
        while (!isCheck) {
            System.out.print("Nhập tên tài khoản : ");
            name = sc.nextLine();
            int count = 0;
            for (Account user : list) {
                if (user.getName().equals(name)) {
                    count++;
                    isCheck = true;
                }
            }
            if (count == 0) {
                System.out.println(name + " không tồn tại , vui lòng nhập lại !");
            }
        }
        return name;
    }

    public Account checkUserPassword(ArrayList<Account> list, String name, String password) {
        for (Account user : list) {
            if (user.getName().equals(name) && (user.getPassword().equals(password))) {
                return user;
            }
        }
        return null;
    }


    public static String checkName(ArrayList<Account> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên tài khoản : ");
        String name = "";
        boolean isCheck = false;
        while (!isCheck) {
            try {
                name = sc.nextLine();
                if (name.trim().isEmpty()) throw new NullPointerException("Bạn chưa nhập gì");
                for (Account user : list) {
                    if (user.getName().equals(name)) throw new MyException("Tài khoản đã tồn tại !");
                }
                isCheck = true;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage() + ", Vui lòng nhập lại");
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", Vui lòng nhập lại");
            }
        }
        return name;
    }

    public static String checkEmail(ArrayList<Account> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email: ");
        String email = null;
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                email = sc.nextLine();
                if (!Validate.validateEmail(email)) throw new MyException("Email không đúng định dạng");
                for (Account user : list) {
                    if (user.getEmail().equals(email)) throw new MyException("Email đã tồn tại !");
                }
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return email;
    }

    public static String checkPassword(ArrayList<Account> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập password: ");
        String password = null;
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                password = sc.nextLine();
                if (!Validate.validatePassword(password))
                    throw new MyException("Password không đúng định dạng (gồm 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt)");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return password;
    }

}
