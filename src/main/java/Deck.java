import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards){
        this.cards = cards;
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }
}
