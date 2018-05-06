package by.it_academy.suits;

import java.util.HashMap;

public class Hearts implements Suits {
    private HashMap<Integer, String> hearts = new HashMap<>();

    @Override
    public HashMap<Integer, String> add() {
        hearts.put(1, "Туз");
        hearts.put(2, "2");
        hearts.put(3, "3");
        hearts.put(4, "4");
        hearts.put(5, "5");
        hearts.put(6, "6");
        hearts.put(7, "7");
        hearts.put(8, "8");
        hearts.put(9, "9");
        hearts.put(10, "10");
        hearts.put(11, "Валет");
        hearts.put(12, "Дама");
        hearts.put(13, "Король");
        return hearts;
    }
}
