package ObjectOriented;

class RectangleC
{
	
	//Updating with setter and getter methods(properties method) incorporating the data hiding.
	private double length;
	private double breath;
	
	public double getlength() {
		return length;
	}
	
	public double getbreath() {
		return breath;
	}
	
	public void setlength(double l) {
		if(l< 0 ) {
			length =0;
		}else {
			length = l;
		}
		
	}
	public void setbreath(double b) {
		if(b< 0 ) {
			breath =0;
		}else {
			breath = b;
		}
	}
	
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
		r.setlength(5);
		r.setbreath(5);
		
		System.out.println("Area " +r.area());
		System.out.println("Perimeter "+ r.rectangle());
		System.out.println("Is it a square "+ r.isSquare());
		
	}

}
