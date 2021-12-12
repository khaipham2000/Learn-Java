package com.company;

public class PartTimeEmployee  extends Employee{
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int partTimeSalary(){
        return workingHours* getPaymentPerHour();
    }

    @Override
    public String toString() {
        return super.toString()+
                " Giờ làm việc: " + workingHours
                ;
    }
}
