import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public int cardCount() {
        return this.hand.size();
    }

    public void receiveCard(Card dealtCard) {
        hand.add(dealtCard);
    }

    public String getName() {
        return this.name;
    }
}
