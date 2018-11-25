package BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = getDeck();
        List<Player> me =
        shuffle(deck);
        printCards(deck);


    }

    static List<Card> getDeck() {
        char[] ranks = new char[]{'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
        char[] suits = new char[]{'♠', '♥', '♣', '♦'};
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[0]));
        }
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[1]));
        }
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[2]));
        }
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[3]));
        }
        return deck;
    }

    private static void printCards(List<Card> deck) {
        for (Card card : deck) {
            System.out.println("Dit is de " + card.getSuit() + " " + card.getRank());
        }
    }
}
