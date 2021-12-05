package com.company;

public class Players {
    private  String name;
    private int number;
    private Position position;

    public Players(String name, int number, Position position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }
    public String getName(){return name;}
    public int getNumber(){
        return number;
    }
    public Position getPosition(){
        return position;
    }

    public void setName() {
        this.name = name;
    }
    public void setNumber() {
        this.number = number;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Players{" +
                " Tên cầu thủ: " + name + '\'' +
                ", Số áo: " + number +
                ", Vị trí: " + position + '\'' +
                '}';
    }
}
