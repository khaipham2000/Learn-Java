package com.company;

public class Coder extends Staff {
    private int overtime;

    public Coder(int id, String name, int age, int phonenumber, String email, long salary, int overtime) {
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

    @Override
    public String toString() {
        return super.toString() +
                ", Số giờ làm thêm: " + overtime + ", Lương thực tế: " + realSalary()
                ;
    }
}
