import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private Card card;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }

    public void populateDeck(){
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        for(int i=0; i<suits.length; i++){
            Suit suit = suits[i];
            for(int j=0; j<ranks.length; j++) {
                Rank rank = ranks[j];
                card = new Card(suit, rank);
                this.cards.add(card);
            }
        }

    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }
    public Card removeCard() {
        return this.cards.remove(0);
    }
}
