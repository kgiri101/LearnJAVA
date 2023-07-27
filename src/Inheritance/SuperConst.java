package Inheritance;

class Rectangle
{
	public double length;
	public double breath;
	public Rectangle() {
		length = 1;
		breath = 1;
	}
	public Rectangle(int l, int b) {
		length  = l;
		breath = b;
	}
}

class Cuboid extends Rectangle
{
	public double height;
	
	public Cuboid()
	{
		height = 1;
	}
	
	public Cuboid(int l, int b, int h) {
		super(l,b);
		height = h;
		
	}
	public double volume()
	{
		return length * breath * height;
	}
}


public class SuperConst {
	
	public static void main(String[] args){
		
		
		//Making the normal objects
		Cuboid c = new Cuboid();
		
		System.out.println("Regular Volume: " + c.volume());
		
		//Making the super object
		
		Cuboid cs = new Cuboid(5,3,10);
		
		System.out.println("Super Volume: " + cs.volume());
		
	}

}
