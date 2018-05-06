package by.it_academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name+", ";
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Player> addPlayer() throws CountOfPlayersException {
        System.out.println("Введите количество игроков:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice > 10) throw new CountOfPlayersException("Превышено количество игроков!!!");
        for (int i = 0; i < choice; i++) {
            System.out.println("Введите имя:");
            name = scanner.nextLine();
            players.add(new Player(name));
        }
        return players;
    }
}