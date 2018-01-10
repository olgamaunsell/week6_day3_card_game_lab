import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Card card1;
    private Card card2;

    @Before

    public void before(){
        player1 = new Player("Olga");
        player2 = new Player("Elvis");
        card1 = new Card(Suit.DIAMONDS, Rank.NINE);
        card2 = new Card(Suit.HEARTS, Rank.QUEEN);
    }

    @Test

    public void hasName(){
        assertEquals("Olga", player1.getName());
    }

    @Test

    public void playerHandStartsEmpty(){
        assertEquals(0, player1.cardCount());
    }

    @Test

    public void canReceiveCard(){
        player1.receiveCard(card1);
        assertEquals(1, player1.cardCount());
    }

}
