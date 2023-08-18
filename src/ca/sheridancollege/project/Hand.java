package ca.sheridancollege.project;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();
    private ActualPlayer owner;

    public void addCardtoHand(Card card){
        hand.add(card);

    }
    public void playCardFromHand(int index){
        owner.getBoard().addCardToBoard(hand.get(index));
        // board.addCardtoHand(hand.get(index));

    }

    public int calculateTotalHandValue(){
        int totalValue = 0;
        for (int i = 0; i < hand.size(); i++){
            totalValue += hand.get(i).getValue().getCardValue();
        }
        return totalValue;
    }
    
}
