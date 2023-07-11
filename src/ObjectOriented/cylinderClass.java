package ObjectOriented;


class Cylinder {
	public double radius;
	public double height;
	
	public double lidArea() {
		return Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea() {
		return 2* lidArea() + circum()*height;
	}
	
	public double circum() {
		return 2* Math.PI * radius;
	}
	public double volume() {
		return lidArea()* height;
	}
}

public class cylinderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder c = new Cylinder();
		c.radius = 5;
		c.height = 5;
		
		//Printing the results
		System.out.println("Lid Area " + c.lidArea());
		System.out.println("TSA "+ c.totalSurfaceArea());
		System.out.println("Volume "+ c.volume());
	}

}
