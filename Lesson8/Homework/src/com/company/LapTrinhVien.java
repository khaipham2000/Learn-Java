package com.company;

import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    private int overtime;

    public LapTrinhVien(){super();}

    public LapTrinhVien(int id, String name, int age, int phonenumber, String email, long salary, int overtime) {
        super(id, name, age, phonenumber, email, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public long realSalary(){
        return getSalary()+ (overtime * 200000);
    }

    public void insertLTV(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập số giờ làm thêm : ");
        overtime = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "LapTrinhVien: " +
                ", Số giờ làm thêm: " + overtime + ", Lương thực tế: " + realSalary()
                ;
    }

}
