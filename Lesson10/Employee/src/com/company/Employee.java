package com.company;

public class Employee implements IEmployee {
   private String name;
   private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public void calculatorSalary() {

    }

    @Override
    public void getName() {

    }

    @Override
    public String toString() {
        return
                " Tên: " + name + '\'' +
                ", Lương 1 giờ làm việc: " + paymentPerHour ;
    }
}
