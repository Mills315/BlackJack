package BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = getDeck();
        List<Player> players = newPlayer();
        shuffle(deck);


    }

    static List<Player> newPlayer() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Yoran"));
        players.add(new Player("Jake"));
        players.add(new Player("Louis"));
        return players;
    }

    static List<Card> getDeck() {
        int[] value = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] ranks = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        char[] suits = new char[]{'♠', '♥', '♣', '♦'};
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            if(value.equals(10)){
                deck.add(new Card(ranks[i], suits[0], value[i]));
                deck.add(new Card(ranks[i+1], suits[0], value[i]));
                deck.add(new Card(ranks[i+2], suits[0], value[i]));
                deck.add(new Card(ranks[i+3], suits[0], value[i]));

            } else {
                deck.add(new Card(ranks[i], suits[0], value[i]));
            }
        }
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[1], value[i]));
        }
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[2], value[i]));
        }
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[3], value[i]));
        }
        return deck;
    }

    private static void printCards(List<Card> deck) {
        for (Card card : deck) {
            System.out.println("Dit is de " + card.getSuit() + " " + card.getRank() + " met een waarde van " + card.getValue() + ".");
        }
    }
}
