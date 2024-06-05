package BlackJack;
import static java.lang.System.out;

import java.util.*;

public class BlackJackRunner {

   private Dealer dealer;
   private Player player;
   private int playerTotal;
   private int dealerTotal;
   private Scanner kb;
   private String input;
   private ArrayList<Player> players;
   private ArrayList<Integer> handValues;

   public BlackJackRunner () {

    // instantiate all of your instance variables
	   dealer = new Dealer();
       playerTotal = 0;
       dealerTotal = 0;
       kb = new Scanner(System.in);
	   input = "";
	   players = new ArrayList<Player>();
	   handValues = new ArrayList<Integer>();
   }

 

   public void playGame(int numPlayers) {  
	   	
	   for(int i = 0; i<numPlayers; i++) {
		   players.add(player = new Player());
		   }
	   
	   do {
	    	
	    	
	    	System.out.println("Shuffling Cards...\n");
	    	dealer.shuffle();
	    	System.out.println("Dealing Cards...\n");
	    	int count = 1;
	    	for(Player x : players) {
	    		x.addCardToHand(dealer.deal());
	    		x.addCardToHand(dealer.deal());
	    		System.out.println("" + x.toString(count));
	    		count++;
	    	}

            dealer.addCardToHand(dealer.deal()); 
            System.out.println(dealer.RevealFirstCard());
            
            count = 1;
	    	for(Player x : players) {
	    		System.out.println(x.toString(count));
	    		x.hit(dealer, count);
	    		count++;
	    	}
	    	
            dealer.hit();
            update();
            
            count = 1;
            for(Player x : players) {
            	gameCheck(x, count);
            	count++;
            	x.resetHand();
	    	}
            System.out.println("\nDealer has won " + dealer.getWinCount()+ " times.");
            
            dealer.resetHand();
            handValues.clear();
            //players.clear();
            
	    	System.out.println("Do you want to play again? (Y or N)\n");
		    input = kb.nextLine();
		    
    
	    } while (input.equals("Y"));
	    System.out.println("\nGood Game!");
   }
   
   
   public void update() {
	   for(Player x : players) {
		 handValues.add( x.getHandValue());
   	}
       dealerTotal = dealer.getHandValue();
   }

   public void gameCheck(Player player, int count) {
	   
	   if(player.getHandValue()>21&&dealerTotal<=21){
          out.println("\nDealer wins - Player "+ count + " busted!");
          dealer.addWin();
       } else if(player.getHandValue()<=21&&dealerTotal>21) {
          out.println("\nPlayer " + count + " wins - Dealer busted!");
          player.addWin();
       } else if(player.getHandValue()>21&&dealerTotal>21) {
          out.println("\nPlayer " + count + " and the Dealer bust!");
       } else if(player.getHandValue() < dealerTotal) {
          out.println("\nDealer has bigger hand value than Player "+ count + " so Dealer Wins!");
          dealer.addWin();
       } else if(player.getHandValue() == dealerTotal) {
    	  out.println("\nPlayer "+ count + " and Dealer have the same score so no one wins!");
       }  else{
          out.println("\nPlayer "+ count + " has bigger hand value!");
          player.addWin();
       }
	   
	   System.out.println("Player " + count + " has won " + player.getWinCount()+ " times.");
	   
   }
   
 

   public static void main( String args[ ] ) {

      BlackJackRunner game = new BlackJackRunner ();
      Scanner kb = new Scanner(System.in);
      System.out.println("How many players do you want to play with?\n");
	  game.playGame(kb.nextInt());
      
   }

}