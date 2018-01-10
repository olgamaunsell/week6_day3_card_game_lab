import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Card> hand;


    public Dealer(Deck deck){
        this.deck = deck;
        this.hand = new ArrayList<>();
    }

    public void getCard(){
        hand.add(this.deck.removeCard());
    }

    public int cardsInHandCount(){
        return this.hand.size();
    }

    public Card dealCard() {
        return this.hand.remove(0);
    }
}
