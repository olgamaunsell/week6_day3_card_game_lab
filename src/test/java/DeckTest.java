import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;
    private ArrayList<Card> cards = new ArrayList<>();


    @Before
    public void before(){
    Suit[] suits = Suit.values();
    Rank[] ranks = Rank.values();

        for(int i=0; i<suits.length; i++){
            Suit suit = suits[i];
            for(int j=0; j<ranks.length; j++) {
                Rank rank = ranks[j];
                card = new Card(suit, rank);
                cards.add(card);
            }
        }
        deck = new Deck(cards);
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.getNumberOfCards());
    }
}
