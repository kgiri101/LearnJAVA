package AbstractClass;

abstract class SuperShape
{
	abstract double perimeter();
	abstract double area();
}

class Circle extends SuperShape
{
	double radius = 4;
	double perimeter() {
		return 2 * Math.PI * radius;
		
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends SuperShape
{	
	double length= 5;
	double breath = 10;

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		
		return 2 * (length + breath);
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * breath;
	}
	
}

public class Shape {
	
	public static void main(String[] args) {
		SuperShape c = new Circle();
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		SuperShape r = new Rectangle();
		System.out.println(r.area());
		System.out.println(r.perimeter());
	}

}
