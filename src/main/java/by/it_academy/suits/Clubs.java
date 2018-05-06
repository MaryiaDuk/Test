package by.it_academy.suits;

import java.util.HashMap;

public class Clubs implements Suits {
    private HashMap<Integer, String> clubs = new HashMap<>();

    @Override
    public HashMap<Integer, String> add() {
        clubs.put(27, "Туз");
        clubs.put(28, "2");
        clubs.put(29, "3");
        clubs.put(30, "4");
        clubs.put(31, "5");
        clubs.put(32, "6");
        clubs.put(33, "7");
        clubs.put(34, "8");
        clubs.put(35, "9");
        clubs.put(36, "10");
        clubs.put(37, "Валет");
        clubs.put(38, "Дама");
        clubs.put(39, "Король");
        return clubs;
    }
}
