package Inheritance;

class Rectangle2

{
	int length;
	int breath;
	
	public Rectangle2(int length, int breath)
	{
		//TO avoid the name conflit, we use this. which is reference to the current objet
		
		this.length = length;
		this.breath = breath;
		
		
	}
	
	void display()
	{
		System.out.println("Length: " + this.length);
		System.out.println("Breath: " + this.breath);
	}
}

public class ThisRef {
	
	public static void main(String[] args)
	{
		Rectangle2 r =  new Rectangle2(10,5);
		r.display();
	}
}
