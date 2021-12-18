package com.company;

public class AddPerson {
    public static void inforWaiter(){
        PersonModel<Waiter> wa = new PersonModel<>();
        wa.add(new Waiter("1","King",22,8000000,500000));
        wa.add(new Waiter("2","Queen",19,7000000,700000));
        wa.add(new Waiter("3","Jack",21,5000000,900000));
        wa.display();
    }

    public static void inforKitchen(){
        PersonModel<Kitchen> ki = new PersonModel<>();
        ki.add(new Kitchen("4","J",25,15000000,1500000));
        ki.add(new Kitchen("5","Q",32,10000000,2500000));
        ki.add(new Kitchen("6","K",29,12000000,1000000));
        ki.display();
    }
}
