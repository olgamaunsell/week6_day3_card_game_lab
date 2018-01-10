import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before

    public void before(){
        card = new Card(Suit.CLUBS, Rank.KING);
    }

    @Test

    public void getSuit(){
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test

    public void getRank(){
        assertEquals(Rank.KING, card.getRank());

    }

}
