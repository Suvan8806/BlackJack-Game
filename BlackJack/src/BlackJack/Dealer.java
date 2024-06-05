package BlackJack;

import java.util.ArrayList;

public class Dealer extends Player {

      //define a deck of cards
	  Deck deck = new Deck();
	  
      public Dealer() {
    	  //Deck deck = new Deck();
      }

      public void  shuffle() {
         //shuffle the deck
    	  deck.shuffle();
      }

      public Card  deal(){

         return deck.nextCard();
      }

      public int numCardsLeftInDeck() {

            return 0;

      }

      public void hit() {

       	  while(getHandValue() <= 16 && getHandValue() < 21 && getHandValue()!=17) {
       		  addCardToHand(deal());
 	  	      System.out.println(toString() + "\n");
             }

        }
      
      public String RevealFirstCard() {
		  String r = "DEALER";
		  int ok = 0;
		  for (Card temp : hand) {
			  r += "\n" + temp.toString();
			  ok = temp.getValue();
			  break;
		  }
	      return r + "\n#### of #### | value = # \n- " + ok + "\n";

	   }
      
      @Override
      
     
    
      public String toString() {
		  String r = "DEALER";
		  for (Card temp : hand) {
			  r += "\n" + temp.toString();
		  }
	      return r + "\n - " + getHandValue();

	   }

}