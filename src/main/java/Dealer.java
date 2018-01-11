import java.util.ArrayList;

public class Dealer {

    private Deck dealerDeck;
    private Player player;

    public Dealer(Deck deck){
        this.dealerDeck = deck;
    }

    public Card dealCard(Player player) {
//      shuffle deck and then deal one card from array deck
        this.dealerDeck.shuffleDeck();
        Card dealtCard = this.dealerDeck.removeCard();
        player.receiveCard(dealtCard);
        return dealtCard;
    }



}
