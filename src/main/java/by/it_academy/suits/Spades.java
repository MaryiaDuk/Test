package by.it_academy.suits;

import java.util.HashMap;

/**
 * Created by masha on 28.04.2018.
 */
public class Spades implements Suits {
    HashMap<Integer, String> spades = new HashMap<>();
    @Override
    public HashMap<Integer, String> add() {
        spades.put(40, "Туз");
        spades.put(41, "2");
        spades.put(42, "3");
        spades.put(43, "4");
        spades.put(44, "5");
        spades.put(45, "6");
        spades.put(46, "7");
        spades.put(47, "8");
        spades.put(48, "9");
        spades.put(49, "10");
        spades.put(50, "Валет");
        spades.put(51, "Дама");
        spades.put(52, "Король");
        return spades;
    }
}
