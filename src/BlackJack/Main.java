package BlackJack;

import java.util.*;

import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = getDeck();
        List<Player> players = newPlayer();
        shuffle(deck);
        printCards(deck);
        dealCards(deck, players);

        // de kaarten worden 1 voor 1 gedeeld! de loop stopt 1 index eerder zodat de dealer maar 1 kaart krijgt.
        addCard(deck, players);
        System.out.println();
        System.out.println("Dit zijn de kaarten van " + players.get(0).getName());
        printPlayerCards(players.get(0).hand);
        System.out.println();
        System.out.println("Dit zijn de kaarten van " + players.get(1).getName());
        printPlayerCards(players.get(1).hand);
        System.out.println();
        System.out.println("Dit zijn de kaarten van " + players.get(2).getName());
        printPlayerCards(players.get(2).hand);
        System.out.println();
        System.out.println("Dit zijn de kaarten van " + players.get(3).getName());
        printPlayerCards(players.get(3).hand);

        // schijnbaar gebruik je scanners voor user input. ik weet niet of ik het goed gebruik, maar here we go

        System.out.println("SPELER 1: U BENT AAN DE BEURT.");
        System.out.println("HIT OR STAND?");
        addCard(deck, players);


    }

    static List<Player> newPlayer() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Yoran"));
        players.add(new Player("Jake"));
        players.add(new Player("Louis"));
        players.add(new Dealer("Dealer"));
        return players;
    }

    static List<Card> getDeck() {
        int[] value = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        char[] ranks = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        char[] suits = new char[]{'♠', '♥', '♣', '♦'};
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            deck.add(new Card(ranks[i], suits[0], value[i]));
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

    private static void printPlayerCards(List<Card> hand) {
        int totalvalue = 0;
        for (Card card : hand) {
            System.out.println("Een " + card.getSuit() + card.getRank() + ".");
            totalvalue = totalvalue + card.getValue();
        }
        System.out.println("De waarde hiervan is " + totalvalue + ".");
    }

    private static void dealCards(List<Card> deck, List<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            players.get(i).hand.add(0, deck.get(0));
            deck.remove(0);
        }
        for (int i = 0; i < (players.size() - 1); i++) {
            players.get(i).hand.add(1, deck.get(0));
            deck.remove(0);
        }
    }

    private static void addCard(List<Card> deck, List<Player> players) {

        for (int i = 0; i <= players.size() - 2; i++) {
            String status = "turn";
            while (status.equals("turn")) {
                System.out.println(players.get(i).getName() + ": U BENT AAN DE BEURT.");
                System.out.println("HIT OR STAND?");
                Scanner scan = new Scanner(System.in);
                System.out.println();
                String hos = scan.nextLine().toLowerCase();
                if (hos.equals("hit")) {
                    players.get(i).hand.add(0, deck.get(0));
                    deck.remove(0);
                    printPlayerCards(players.get(i).hand);
                } else {
                    status = "stand";
                }

            }
        }
    }
}
