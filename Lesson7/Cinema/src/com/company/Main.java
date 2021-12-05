package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Cinema> listCinema = AddCinema.list();
        System.out.println("Danh sách phim: " + "\n");
        for (Cinema subCinema : listCinema) {
            System.out.println(subCinema + "\n");
        }
        System.out.println("Danh sach phim thuộc thể loại Action: ");
        for (int i = 0; i < listCinema.size(); i++) {
            if (listCinema.get(i).getGenre() == "Action") {
                System.out.println(listCinema.get(i));
            }
        }
    }
}
