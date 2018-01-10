import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test

    public void checkDeckStartsEmpty(){
        assertEquals(0, deck.getNumberOfCards());
    }

    @Test

    public void populateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test

    public void canRemoveCard(){
        deck.populateDeck();
        deck.removeCard();
        assertEquals(51, deck.getNumberOfCards());
    }


}
