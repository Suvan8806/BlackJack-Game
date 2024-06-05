package BlackJack;

public class BlackJackCard extends Card

{
	
	//private int faceVal;
   //constructors
	public BlackJackCard() {
		   super();
	   }
	   
	   public BlackJackCard(int f, String s) {
		   
		   
		   super(f,s);
	   }
   
	
	   @Override
	
	   
	public int getValue() {
      //override the Card getValue to build BlackJack logic
      //enables you to build the value for the game into the card
      //this makes writing the whole program a little easier
	  if (super.getValue() > 10) {
		  return 10;
	  }
      return super.getValue();

   }

    public String toString(){
    	return super.getFace() + " of " + super.getSuit() + " | value = " + getValue(); 
    	}
   

}