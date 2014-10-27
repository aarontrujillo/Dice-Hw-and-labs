package dice;


public class Lab3Main {

	  public static void main (String[] args)
	   {
		  int roll;
		  
		  roll = 1 + (int)(Math.random() * 6);
		
		  Lab3 player = new Lab3 (roll);
	    
	     
		  System.out.printf("Player rolled a %d.\n", player.Value());
}

}  
