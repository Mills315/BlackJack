package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private char rank;
    private char suit;
    private int value;

    public Card(char rank, char suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public char getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
