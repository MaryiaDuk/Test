package by.it_academy;

import by.it_academy.suits.Clubs;
import by.it_academy.suits.Diamond;
import by.it_academy.suits.Hearts;
import by.it_academy.suits.Spades;

import java.util.HashMap;

public class Cards {
    HashMap<Integer, String> cards = new HashMap<>();

    public HashMap<Integer, String> add() {
        Diamond diamond = new Diamond();
        Clubs clubs = new Clubs();
        Hearts hearts = new Hearts();
        Spades spades = new Spades();
        cards.putAll(hearts.add());
        cards.putAll(diamond.add());
        cards.putAll(clubs.add());
        cards.putAll(spades.add());
        return cards;
    }
}
