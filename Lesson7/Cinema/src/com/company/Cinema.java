package com.company;

public class Cinema {
    private String ID;
    private String name;
    private String genre;
    private int minus;
    private String producer;
    private int year;

    public Cinema(String ID, String name, String genre, int minus, String producer, int year) {
        this.ID = ID;
        this.name = name;
        this.genre = genre;
        this.minus = minus;
        this.producer = producer;
        this.year = year;
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public int getMinus(){
        return minus;
    }
    public String getProducer() { return producer; }
    public int getYear() {return  year; }

    @Override
    public String toString() {
        return "Cinema{" +
                " ID: " + ID + '\'' +
                ", Tên Phim: " + name + '\'' +
                ", Thể Loại: " + genre + '\'' +
                ", Thời lượng: " + minus +
                ", Nhà Sản Xuất: " + producer + '\'' +
                ", Năm Phát Hành: " + year +
                '}';
    }
}