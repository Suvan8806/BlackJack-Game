package BlackJack;

import static java.lang.System.*;

public class DeckTestOne{

      public static void main( String args[] ){

             Deck deck = new Deck();     
             
                 
                 

             out.println("\n\n");

             out.println("number cards left in the deck == " + deck.numCardsLeft());

             out.println("\n\nshuffling");

             deck.shuffle();

             out.println("num cards left in the deck == " + deck.numCardsLeft() + "\n");
             
             for(int i = 0; i < 5; i++) {
                 out.println(deck.nextCard());
             }
             
             out.println("num cards left in the deck == " + deck.numCardsLeft() + "\n");
             
             deck.shuffle();
             out.println("\n\nshuffling");

             out.println("num cards left in the deck == " + deck.numCardsLeft() + "\n");
             
             for(int i = 0; i < 5; i++) {
                 out.println(deck.nextCard());
             }
             
             out.println("num cards left in the deck == " + deck.numCardsLeft() + "\n");
             
             

                         

             out.println("\n\ntoString");

             out.println(deck);                                            

      }

} 