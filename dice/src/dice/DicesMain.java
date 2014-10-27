package dice;



public class DicesMain {
    public static void main(String[] args) {
        
    	Dices dice = new Dices();
        System.out.println("The history of dices rolled:"); 
        System.out.println(dice.Value());
    }
}