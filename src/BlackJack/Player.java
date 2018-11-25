package BlackJack;

import java.util.ArrayList;

public class Player {

    private String name;
    public ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

}
