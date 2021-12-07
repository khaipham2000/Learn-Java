package com.company;

import java.util.Scanner;

public class Checker extends Staff {
    private int countErrors;

    public Checker (int id, String name, int age, int phonenumber, String email, long salary, int countErrors) {
        super(id, name, age, phonenumber, email, salary);
        this.countErrors = countErrors;
    }

    public int getCountErrors() {
        return countErrors;
    }

    public void setCountErrors(int mistake) {
        this.countErrors = mistake;
    }

    public long realSalary(){
        return getSalary() + (countErrors * 50000);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Số lỗi tìm thấy : " + countErrors + ", Lương thực tế: " + realSalary()
                ;
    }
}
