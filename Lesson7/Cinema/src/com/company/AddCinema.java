package com.company;

import java.util.ArrayList;

public class AddCinema {
    static ArrayList<Cinema> inforCinema;

    public static ArrayList<Cinema> list() {
        inforCinema = new ArrayList<>();
        inforCinema.add(new Cinema("145", "Conjuring", "Horror", 115, "Warner Bros", 2021));
        inforCinema.add(new Cinema("241", "Sing 2", "Cartoon", 120, "Universal Pictures", 2021));
        inforCinema.add(new Cinema("049", "Pitch Perfect", "Comedy", 107, "Fox", 2011));
        inforCinema.add(new Cinema("274", "A Star Is Born", "Romance", 115, "Warner Bros", 2019));
        inforCinema.add(new Cinema("185", "Spider Man: No Way Home", "Action", 145, "Sony", 2021));
        return inforCinema;
    }
}