package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

	   public ArrayList<Card> hand;

	   private int winCount;

	   public Player () {
		   hand = new ArrayList<Card>();
		   winCount = 0;
	   }


	   public Player (int score) {
		   hand = new ArrayList<Card>();
		   winCount = score;
		   
	   }


	   public void addCardToHand( Card temp ) {
		   hand.add(temp);
	   }


	   public void resetHand() {
		   hand.clear();
	   }


	   public  void setWinCount( int numwins ) {
		   winCount = numwins;
	   }
	   
	   public  void addWin() {
		   winCount++;
	   }


	   public int getWinCount() { return winCount; }


	   public int getHandSize() { return hand.size(); }


	   public int getHandValue() {
		   int c = 0;
		   for (Card temp : hand) {
			  c += temp.getValue();
		  }
	      return c;

	   }


	   public  void  hit(Dealer dealer, int count) {
		   Scanner kb = new Scanner(System.in);
		   String wow = "";
		   
		   System.out.println("PLAYER " + count + " do you want to hit? (Y or N) ");
		    wow = kb.nextLine();
		    
           while(getHandValue() < 21 && wow.equals("Y")) {
   	    	addCardToHand(dealer.deal());
   	    	System.out.println("\n" + toString(count));
   	    	if(getHandValue() < 21) {
   	    		System.out.println("Do you want to hit? (Y or N) ");
       	    	wow = kb.nextLine();
   	    	}
   	    	
           }
	   }

	 

	   public String toString(int c) {
		  String r = "PLAYER " + c;
		  for (Card temp : hand) {
			  r += "\n" + temp.toString();
		  }
	      return r + "\n - " + getHandValue() + "\n";

	   }

	} 