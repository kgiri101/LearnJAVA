package Inheritance;

class Parent2
{
	public Parent2()
	{
		System.out.println("Non-Para Const of Parent");
	}
	public Parent2(int x)
	{
		System.out.println("Para Const of Parent");
	}
}

//Child Extending Parent Class
//Specialization

class Child2 extends Parent2
{
	public Child2()
	{
		System.out.println("Non- Para Const of Child");
		
	}
	
	public Child2(int x)
	{
		System.out.println("Para Const of Child");
	}
}


public class ParaConstruct {

	
	public static void main(String[] args)
	{
		
		System.out.println("Non-Para Parent: ");
		
		Parent2 np = new Parent2();
		
		System.out.println("Non- Para Child: ");
		
		Child2 nc = new Child2();
		
		System.out.println("Para Parent: ");
		
		Parent2 p = new Parent2(5);
		
		System.out.println("Para Child: ");
		
		Child2 c = new Child2(5);
		
	}
}
