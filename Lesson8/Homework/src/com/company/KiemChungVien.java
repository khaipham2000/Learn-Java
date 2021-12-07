package com.company;

import java.util.Scanner;

public class KiemChungVien extends NhanVien {
    private int countErrors;

    public KiemChungVien(){super();}

    public KiemChungVien(int id, String name, int age, int phonenumber, String email, long salary, int countErrors) {
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

    public void insertKCV(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập số lỗi tìm thấy : ");
        countErrors = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "KiemChungVien: " +
                ", Số lỗi tìm thấy : " + countErrors + " Lương thực tế: " + realSalary()
                ;
    }
}
