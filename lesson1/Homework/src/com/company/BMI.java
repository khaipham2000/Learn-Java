package com.company;

public class BMI {
    public void health(int c, double d){
        System.out.println(" Chỉ số sức khỏe " + (c/(d*d)));
    }

   public double bmi (double weight, double height){
        return (weight/(height*height));
    }
}
