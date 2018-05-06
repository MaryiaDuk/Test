package by.it_academy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Game {
    private Cards cards = new Cards();
    private HashMap<Integer, String> cardsHashMap;

    public void game() {
        HashMap<Player, Integer> playerSum = new HashMap<>();
        Player player = new Player(null);
        try {
            player.addPlayer();
        } catch (CountOfPlayersException e) {
            e.printStackTrace();
        }
        List<Player> list = player.getPlayers();
        cardsHashMap = cards.add();
        ArrayList<String> playerCards = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = 0; sum < 16; j++) {
                int key = random.nextInt(cardsHashMap.size());
                String str = cardsHashMap.get(key);
                int temp = eq(str);
                sum += temp;
                playerCards.add(str);
                cardsHashMap.remove(key);
            }
            System.out.println(list.get(i) + "Сумма " + sum);
            System.out.println(playerCards.toString());
            playerCards.clear();
            playerSum.put(list.get(i), sum);
        }
        victory(playerSum, list);
    }

    private void victory(HashMap<Player, Integer> summa, List<Player> list) {
        int sum;
        for (int i = 0; i < summa.size(); i++) {
            sum = summa.get(list.get(i));
            if (sum == 21) System.out.println("Победил " + list.get(i));
        }
    }

    private int eq(String str) {
        int temp = 0;
        if (str.equals("2")) {
            temp = 2;
        }
        if (str.equals("3")) {
            temp = 3;
        }
        if (str.equals("4")) {
            temp = 4;
        }
        if (str.equals("5")) {
            temp = 5;
        }
        if (str.equals("6")) {
            temp = 6;
        }
        if (str.equals("7")) {
            temp = 7;
        }
        if (str.equals("8")) {
            temp = 8;
        }
        if (str.equals("9")) {
            temp = 9;
        }
        if (str.equals("10")) {
            temp = 10;
        }
        if (str.equals("Валет")) {
            temp = 10;
        }
        if (str.equals("Дама")) {
            temp = 10;
        }
        if (str.equals("Король")) {
            temp = 10;
        }
        if (str.equals("Туз")) {
            temp = 11;
        }
        return temp;
    }
}