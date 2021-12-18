package com.company;

public class Kitchen extends Employee {
    private long serviceCharge;

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public long calculatorSalary(){
        return getBasicSalary() + serviceCharge;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Phí dịch vụ: " + serviceCharge +", Lương thực tế: "+ calculatorSalary();
    }
}
