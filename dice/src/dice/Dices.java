package dice;

public class Dices {

	public int Throw(){
		int total = 0;
		for(int i = 1; i< 11; i++)
		{
			int dices= (int) (1 + (Math.random() * 6));
			System.out.printf("Dice %d = %d\n", i , dices);
		}
	        return total;
		}
	 public int Value ()
	    {
	        return Throw();
	    }
} 

// Where is your constructor please?
