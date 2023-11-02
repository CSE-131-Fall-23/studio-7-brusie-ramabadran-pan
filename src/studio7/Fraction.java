package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	
	public Fraction(int initnumerator, int initdenominator) {
		numerator = initnumerator;
		denominator = initdenominator;
		
	}
	
	
	
	public Fraction add(Fraction testFrac) {
		int CD = denominator*testFrac.denominator;
		
		int num1 = numerator*(testFrac.denominator);
		int num2 = (testFrac.numerator)*denominator;
		int sum = num1 + num2;
		Fraction f =  new Fraction(sum, CD);
		return f;
		
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		Fraction myFrac = new Fraction(2,3);
		Fraction myAdd = new Fraction(4,5);
		System.out.println(myFrac.add(myAdd));
		// TODO Auto-generated method stub

	}

}
