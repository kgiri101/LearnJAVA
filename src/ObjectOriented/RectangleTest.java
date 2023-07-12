package ObjectOriented;



class Rectangle1{
	private double length;
	private double breath;
	
	//Constructor without parametiazation
	public Rectangle1() {
		length = 5;
		breath = 5;
	}
	
	//Constructor with the parametiazation
	
	public Rectangle1(double len, double b) {
		length = len;
		breath = b;
	}
	
	public double area() {
		return length*breath;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object
		
		//Without the parameters
		Rectangle1 r = new Rectangle1();
		System.out.println("Area of  r is "+ r.area());
		
		//With parameters
		
		Rectangle1 rp = new Rectangle1(10,10);
		
		System.out.println("Area of rp is "+ rp.area());
		
		

	}

}



