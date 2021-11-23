package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Caculation re = new Caculation();
    re.number(10,5);

    BMI me = new BMI();
    me.health(71, 1.75);

       BMI m = new BMI();
       double bmi = m.bmi(71, 1.75);
        System.out.println(" Chỉ số bmi " + bmi);
    }

}
