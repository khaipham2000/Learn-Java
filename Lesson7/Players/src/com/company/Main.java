package com.company;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Players> allPlayers = Add.list();
        System.out.println("Danh sách đội hình 22 cầu thủ tham gia thi đấu: " + "\n");
        for (Players subPlayer : allPlayers) {
            System.out.println(subPlayer);
        }
        ArrayList<Players> selectedTeam = new ArrayList<Players>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forWarderSize = 0;
        System.out.println("List cầu thủ sơ đồ 1GK - 4DF - 4MF - 2FW: ");
        while (gateKeeperSize < 1) {
            int rdGateKeeper = general.nextInt(22);
            if (allPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(allPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while (defenderSize < 4) {
            int rdDefender = general.nextInt(22);
            if (allPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                selectedTeam.add(allPlayers.get(rdDefender));
                defenderSize++;
            }
        }
        while (midFieldSize < 4) {
            int rdmidField = general.nextInt(22);
            if (allPlayers.get(rdmidField).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(allPlayers.get(rdmidField))) {
                selectedTeam.add(allPlayers.get(rdmidField));
                midFieldSize++;
            }

        }
        while (forWarderSize < 2) {
            int rdforWarder = general.nextInt(22);
            if (allPlayers.get(rdforWarder).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(allPlayers.get(rdforWarder))) {
                selectedTeam.add(allPlayers.get(rdforWarder));
                forWarderSize++;
            }
        }
        for (Players s : selectedTeam) {
            System.out.println("Số áo: " + s.getNumber() + " -" + " Tên: " + s.getName() + " -" + " Vị trí: " + s.getPosition());
        }
        System.out.println("-------------------------");
    }
}
