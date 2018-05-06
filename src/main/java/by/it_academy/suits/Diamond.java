package by.it_academy.suits;

import java.util.HashMap;

public class Diamond implements Suits {
    HashMap<Integer, String> diamond = new HashMap<>();
    @Override
    public HashMap<Integer, String> add() {
        diamond.put(14, "Туз");
        diamond.put(15, "2");
        diamond.put(16, "3");
        diamond.put(17, "4");
        diamond.put(18, "5");
        diamond.put(19, "6");
        diamond.put(20, "7");
        diamond.put(21, "8");
        diamond.put(22, "9");
        diamond.put(23, "10");
        diamond.put(24, "Валет");
        diamond.put(25, "Дама");
        diamond.put(26, "Король");
        return diamond;
    }
}
