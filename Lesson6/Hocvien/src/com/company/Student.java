package com.company;

public class Student {
 public int id;
 public String name;
 public int score1;
 public int score2;
 public static String school = "Techmaster";

 public double score(){
  return (score1+score2)/2;
 }

 public Student(int id, String name, int score1, int score2) {
  this.id = id;
  this.name = name;
  this.score1 = score1;
  this.score2 = score2;
 }

 @Override
 public String toString() {
  return id + "-" + name + "-" + score1 + "-" + score2 + "-" + score() + "-"+ school;
 }
}
