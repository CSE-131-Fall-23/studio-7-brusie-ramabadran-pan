package studio7;

public class Rectangle {
	
	private int Width;
	private int Length;
	
	
	public Rectangle(int initWidth, int initLength) {
		Width = initWidth;
		Length = initLength;
	}
	public double area() {
		double area = Width*Length;
		return area;
	}
	public double perimeter() {
		double perim = 2*(Length+Width);
		return perim;
	}
	public boolean isSquare() {
		if(Length == Width) {
			return true;
		}
		else {
			return false;
		}
	}
	public String compareto(Rectangle inputR) {
		double newarea = inputR.area();
		if(this.area()<newarea) {
			return "Is smaller";
		}
		else {
			return "Is bigger";
		}
	}
	
	

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(9,4);
		Rectangle testR = new Rectangle(3,2);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(r1.isSquare());
		System.out.println(r1.compareto(testR));



	}

}
