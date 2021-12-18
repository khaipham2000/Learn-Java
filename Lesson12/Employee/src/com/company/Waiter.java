package com.company;

public class Waiter extends Employee {
      private long compensate;

    public Waiter(String id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    public long calculatorSalary(){
        return getBasicSalary() + compensate;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Tiền tip: " + compensate + ", Lương thực tế: " +calculatorSalary();

    }
}
