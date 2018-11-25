package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private char rank;
    private char suit;

    public Card(char rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public char getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }


}
