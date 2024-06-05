package BlackJack;

import java.util.Arrays;

public class Card

{

   public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",

                     "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

   private String suit;
   private int faceVal;
   private String face;
   //private String face;

   //constructors
   public Card() {
	   suit = "";
	   faceVal = 0;
	   setFace();
   }
   
   public Card(int f, String s) {
	   suit = s;
	   faceVal = f;
	   setFace();
   }

   //set methods
   public void setFace() { face = FACES[faceVal]; }
   
   public void setSuit(String s) { suit = s;}
   
   public void setValue(int i) { face = FACES[i];}
   
 

   //get method
   public int getValue(){ return faceVal; }
   public String getFace(){ return face; }
   public String getSuit(){ return suit; }

    

   //equals method
   public boolean equals(Card a, Card b) {
	   if (a.getValue() == b.getValue()) {
		   return true;
	   }
	   return false;
   }
 

   //toString method 
   //ACE of DIAMONDS | value = 11
   public String toString(){
	   return face + " of " + suit + " | value = " + faceVal; 
   }

 }