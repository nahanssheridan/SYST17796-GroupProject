package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;

public class Start extends Game {
    private int round;
    private Deck gameDeck;

    public Start(String name){
        super(name);
    }

    @Override
    public void play(){
        
    }

    @Override
    public void declareWinner(){

    }

    public void updateRound(){
        round++;
    }

    public int calculateScore(ActualPlayer x, ActualPlayer y){

        return 1;
    }

    public boolean determineRaider(){
        return false;
    }

    public static void main(String[] args){
        Start thisGame = new Start("Raiders");
        System.out.println("Welcome to " + thisGame.getName() + " game!!!");
        // System.out.print("\nPlease enter your username: ");

        // Scanner input = new Scanner(System.in);


        ActualPlayer player1 = new ActualPlayer("Adegoke");
        ActualPlayer player2 = new ActualPlayer("Computer");

        // for(int i = 0; i < CardNumber.values().length; i++){
        //     System.out.println(CardNumber.values()[i]);
        // }
        // ArrayList<Card> deck = Deck.getDeck();
        Deck.dealCard(player1);
        
        System.out.println(player1.getBoard().calc());
        System.out.println(player1.getBoard().get(0).getValue());

    }
    
}