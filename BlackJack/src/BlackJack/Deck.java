package BlackJack;

import java.util.Stack;

public class Deck {

	   public static final int NUMFACES = 13;
	   public static final int NUMSUITS = 4;
	   public static final int NUMCARDS = 52;

	   public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	    //must use a stack to store the cards
	   private Stack<Card> cards;
	     
	   // constructor
	   public Deck()   {

	     //initialize the instance variables 
		   cards = new Stack();
		   
	     //add 52 cards to the stack
		   for (int i = 0; i < NUMCARDS; i++) {
			   Card a = new BlackJackCard();
			   cards.push(a);
		   }
		   
	   }

	 

	   public void shuffle(){     
		   int a = size();
		   for( int i=0; i<a; i++) {
               nextCard();

             }   

	      //add code to add 52
		   
	       //52 cards to the stack
		   String b[] = new String[52];
	       //should be random
		   int count = 0;
		   while (count < 52) {
			   int randSuit = (int)(Math.random() * 4) + 0;
			   int randNum = (int)(Math.random() * 13) + 1;
			   String temp = String.valueOf(randSuit) + "0" + String.valueOf(randNum);
			   boolean check = false;
			   for(String fifty : b) {
				   if (fifty == null) {
					   check = true;
				   } else if (fifty.equals(temp)) {
					   check = false;
				   }
			   }
			   
			   if (check) {
				   b[count] = temp;
				   Card wow = new BlackJackCard(randNum,SUITS[randSuit]);
				   cards.push(wow);
				   count++;
			   }
			   
		   }
		   
	   }
	   
	   
	   public int size()  {   return cards.size(); }

	   public int numCardsLeft(){return size(); }


	   public Card nextCard(){   return cards.pop();  } 

	   
	   public String toString(){
	      return "lots of cards";
	   }
	}

