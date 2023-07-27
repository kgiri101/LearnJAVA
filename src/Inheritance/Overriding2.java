package Inheritance;

class Car
{
	public void start() {System.out.println("Car has Started");}
	
	public void changeGear() {System.out.println("Car's Gear  is Changed");}
	
	public void accelerate() {System.out.println("Car is accelerating");}
	
	
}

class LuxaryCar extends Car
{
	

	
	public void changeGear() {System.out.println("Automatic Gear");}
	
	public void openRoof() {System.out.println("The Roog is opening");}
	

	
}

public class Overriding2 {

	
	public static void main(String[] args)
	{
		Car c = new Car();
		c.accelerate();
		c.changeGear();
		c.start();
		
		
		LuxaryCar lc = new LuxaryCar();
		//Method is overriding
		lc.accelerate();
		lc.changeGear();
		lc.start();
		lc.openRoof();
		
		//Dynamic Method Dispatch
		//Even we are taking the reference of Super class and object of the sub class,
		//the object we created can only have methods presented in the super class but
		//all the methods are overridden by the the sub class and we cannot call the methods
		//presented in the sub class.
		Car c1  = new LuxaryCar();
		
		c1.accelerate();
		c1.changeGear();
		c1.start();
		
	}
}
