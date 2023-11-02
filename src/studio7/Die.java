package studio7;

public class Die {
	
	// instance variables
	private int NumSides;
	
	public Die(int initNumSides) {
		NumSides = initNumSides;
		
	}
	public int roll() {
		return (int)(Math.random()*NumSides + 1);
	}
	
	public static void main(String[] args) {
		Die die1 = new Die(6);
		System.out.println(die1.roll());
	}

}
