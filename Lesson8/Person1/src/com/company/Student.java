package com.company;

public class Student extends Person {
    private double theoreticalPoint;
    private double practicalPoint;

    public Student(int id, String name, int age, String address, double theoreticalPoint, double practicalPoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.practicalPoint = practicalPoint;
    }

    public double getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public double getPracticalPoint() {
        return practicalPoint;
    }

    public void setTheoreticalPoint(double theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public void setPracticalPoint(double practicalPoint) {
        this.practicalPoint = practicalPoint;
    }

    public double GPA(){
        return (theoreticalPoint + practicalPoint)/2;
    }

    @Override
    public String toString() {
        return super.toString() + " Student: " +
                ", diem ly thuyet: " + theoreticalPoint +
                ", diem thuc hanh: " + practicalPoint +
                ", diem trung binh: " + GPA();
    }
}
