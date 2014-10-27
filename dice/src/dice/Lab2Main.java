package dice;

public class Lab2Main {

	  public static void main (String[] args)
	   {
		  Lab1Dice dice1;
		  Lab2dice dice2;

		  dice1 = new Lab1Dice();
		  dice2 = new Lab2dice();
	    
		  dice1.roll();
		  dice2.roll();
	     
	      System.out.println("The dice1 is " + dice1.getTotal()
	    		   + " and dice2 is " +  dice2.getTotal());
}

} 