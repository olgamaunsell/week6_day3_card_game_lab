import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Deck deck;
    private Player player;
    private Dealer dealer;


    @Before

    public void before(){

        deck = new Deck();
        deck.populateDeck();
        player = new Player();
        dealer = new Dealer(deck);

    }

    @Test
    public void canGetCard(){
        dealer.getCard();
        assertEquals(51, deck.getNumberOfCards());
    }

    @Test

    public void canRemoveCardFromHand(){
        dealer.getCard();
        dealer.dealCard();
        assertEquals(0, dealer.cardsInHandCount());

    }



}
