package com.company;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public int fullTimeSalary(){
        return 8* getPaymentPerHour();

    }

    @Override
    public String toString() {
        return super.toString() + " Giờ làm việc: " + fullTimeSalary();
    }
}
