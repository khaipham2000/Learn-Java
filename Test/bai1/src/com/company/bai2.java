package com.company;

public class bai2 {
    public static void Word(){
        String s1 = "You only live once, but if you do it right, once is enough";
        System.out.println(s1);
        String[] words = s1.split(" ");
        System.out.println("Số từ trong chuỗi là: " +words.length);

        char sys = 'o' ;
        for (int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) == sys){
                System.out.println(" Vị trí của ký tự o là:" +i);
            }
        }
    }
}
