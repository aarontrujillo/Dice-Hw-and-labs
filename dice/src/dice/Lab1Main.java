package dice;



public class Lab1Main {

	  public static void main (String[] args)
	   {
		  Lab1Dice dice1;

		  dice1 = new Lab1Dice();
	    
		  dice1.roll();
	     
		  System.out.printf("Player rolled a %d.\n", dice1.Value());
}

}  
