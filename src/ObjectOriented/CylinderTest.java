package ObjectOriented;


class Cylinder1{
	private double radius;
	private double  height;
	
	public Cylinder1() {
		radius = 0;
		height = 0;
	}
	 public Cylinder1(double r) {
		 radius = r;
		 height = 0;
	 }
	 
	 public Cylinder1(double r, double h) {
		 radius = r;
		 height = h;
	 }
	 
	 public double getRadius() {
		 return radius;
	 }
	 
	 public double getHeight() {
		 return height;
	 }
	 
	 public void setRadius(double len) {
		 radius = len;
		 
	 }
	 
	 public void setHeight(double h) {
		 height = h;
	 }
	 
	 public void setDimensions(double l, double h) {
		 radius = l;
		 height = h;
	 }
	 
	 public double area() {
		 return Math.PI*radius*radius;
	 }
	 
	 public double volume() {
		 return area()*height;
	 }
}

public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder1 c =  new Cylinder1();
		Cylinder1 c1 = new Cylinder1(5);
		Cylinder1 c2 = new Cylinder1(5,5);
		Cylinder1 c3 = new Cylinder1();
		
		//For c
		System.out.println("For c area is: " + c.area());
		System.out.println("For c, Volume is " +  c.volume());
		
		//For c1
		System.out.println("For c1 area is: " + c1.area());
		System.out.println("For c1, Volume is " +  c1.volume());
		
		
		//For c2
		
		System.out.println("For c2 area is: " + c2.area());
		System.out.println("For c2, Volume is " +  c2.volume());
		
		//For c3
		
		c3.setDimensions(2, 3);
		
		System.out.println("For c3 area is: " + c3.area());
		System.out.println("For c3, Volume is " +  c3.volume());
		

	}

}
