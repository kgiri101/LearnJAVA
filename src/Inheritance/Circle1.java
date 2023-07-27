package Inheritance;

 class Circle {
	
	public double radius;
	
	public double area() {
		return Math.PI * radius * radius;
		
	}
	//Perimeter
	
	public double perimeter() {
		return 2* Math.PI * radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle
{
	public double height;
	
	public double volume()
	{
		//Area() is borrowed from the Circle1 class
		return area() * height;
	}
	
}

public class Circle1 {
	
	public static void main(String[] args)
	{
		Cylinder c1 = new Cylinder();
		
		c1.height = 10;
		c1.radius= 7;
		
		System.out.println("Volume:" + c1.volume());
		System.out.println("Area: " + c1.area());
		
	}
}