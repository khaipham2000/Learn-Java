package com.company;

public class SchoolBook extends Library{
private int page;
private String situation;
private int borrow;

    public SchoolBook(int id, String name, String producer, int year, int number, int page, String situation, int borrow) {
        super(id, name, producer, year, number);
        this.page = page;
        this.situation = situation;
        this.borrow = borrow;
    }

    public int getPage() {
        return page;
    }

    public String getSituation() {
        return situation;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public void setBorrow(int borrow) {
        this.borrow = borrow;
    }

    public  int tonKho(){
        if (getBorrow() < getNumber()){
            return getNumber() - getBorrow();
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + page + "-" + situation + "-" + borrow + " " + tonKho()
                ;
    }
}
