package com.company;

import java.util.ArrayList;

public class Add {

    static ArrayList<Players> listPlayers;

    public static ArrayList<Players> list() {
        listPlayers = new ArrayList<>();
        listPlayers.add(new Players("A", 1, Position.GK));
        listPlayers.add(new Players("B", 2, Position.DF));
        listPlayers.add(new Players("C", 3, Position.DF));
        listPlayers.add(new Players("D", 4, Position.DF));
        listPlayers.add(new Players("E", 5, Position.DF));
        listPlayers.add(new Players("F", 6, Position.MF));
        listPlayers.add(new Players("G", 7, Position.MF));
        listPlayers.add(new Players("H", 8, Position.MF));
        listPlayers.add(new Players("I", 9, Position.MF));
        listPlayers.add(new Players("K", 10, Position.MF));
        listPlayers.add(new Players("L", 11, Position.FW));
        listPlayers.add(new Players("M", 12, Position.FW));
        listPlayers.add(new Players("N", 13, Position.FW));
        listPlayers.add(new Players("O", 14, Position.DF));
        listPlayers.add(new Players("P", 15, Position.DF));
        listPlayers.add(new Players("Q", 16, Position.DF));
        listPlayers.add(new Players("R", 17, Position.FW));
        listPlayers.add(new Players("S", 18, Position.FW));
        listPlayers.add(new Players("T", 19, Position.GK));
        listPlayers.add(new Players("U", 20, Position.GK));
        listPlayers.add(new Players("V", 21, Position.MF));
        listPlayers.add(new Players("W", 22, Position.MF));
        return listPlayers;
    }
}