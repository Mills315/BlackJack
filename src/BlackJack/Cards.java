package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private char rank;
    private char suit;


    static List<Cards> getDeck() {
        char[] ranks = new char[] {2,3,4,5,6,7,8,9,10,'J','Q','K','A'};
        char[] suits = new char[] {'♠', '♥', '♣', '♦'};
        List<Cards> deck = new ArrayList<>();
        for (int i = 0; i == 12 ; i++){
            deck.add(new Cards(ranks[i], suits[0]));
        }
        for (int i = 0; i == 12 ; i++){
            deck.add(new Cards(ranks[i], suits[1]));
        }
        for (int i = 0; i == 12 ; i++){
            deck.add(new Cards(ranks[i], suits[2]));
        }
        for (int i = 0; i == 12 ; i++){
            deck.add(new Cards(ranks[i], suits[3]));
        }
        return deck;
    }

    private Cards(char rank, char suit){
        this.rank=rank;
        this.suit=suit;
    }

}
