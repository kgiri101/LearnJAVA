package ObjectOriented;

class RectangleC
{
	public double length;
	public double breath;
	
	public double area(){
		return length*breath;
	}
	public double rectangle() {
		return 2*(length*breath);
	}
	public boolean isSquare() {
		if(length ==  breath) {
			return true;
		}else {
			return false;
		}
	}
}

public class rectangle {
	public static void main(String[] args) {
		RectangleC r = new RectangleC();
		r.length = 10.5;
		r.breath = 5.5;
		
		System.out.println("Area " +r.area());
		System.out.println("Perimeter "+ r.rectangle());
		System.out.println("Is it a square "+ r.isSquare());
		
	}

}
