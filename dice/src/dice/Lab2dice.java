package dice;

public class Lab2dice {
	
	public final int MAX = 6;
	public int dice1;  
	public int dice2; 


public void roll() 
{
   dice1 = 1 + (int)(Math.random() * 6);
   dice2 = 1 + (int)(Math.random() * 6);
  
   }
        
public int getDice1() 
{   
  return dice1;
  }

public int getDice2() 
{   
  return dice2;
  }

public int getTotal() 
{
 return dice1 + dice2;
  }

public int Throw() 
{
	return dice1 + dice2;
}
public int Value ()
{
    return Throw();
}

} 