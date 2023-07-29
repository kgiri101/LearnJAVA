package AbstractClass;


abstract class Super
{
	public Super() {
		System.out.println("Super Constructor!!");
	}
	
	public void meth1() {
		System.out.println("Meth1 of the Super");
	}
	abstract public void meth2();
}


class Sub extends Super
{
	public void meth2() {
		System.out.println("Sub methods");
	}
}
public class AbstractExample {
	
	public static void main(String[] args)
	{
		//Abstract class cannot be instansciated
		Super s = new Sub();
		s.meth1();
		s.meth2(); 
	}
}
