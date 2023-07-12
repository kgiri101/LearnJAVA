package ObjectOriented;

class ProductDetail{
	private int itemno;
	private String name;;
	private double price;
	private int qty;
	
	public ProductDetail(int i, String n) {
		itemno = i;
		name = n;
	}
	public ProductDetail(int i, String n, double p, int q) {
		itemno = i;
		name = n;
		price = p;
		qty =q;
	}
	
	//Getter and Setter
	public double getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public int getItemno() {
		return itemno;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double p) {
		price = p;
		
	}
	public void setQty(int q) {
		qty =q;
	}
}

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDetail p1 = new ProductDetail(11111, "Bottle");
		p1.setPrice(1000);
		p1.setQty(20);

		System.out.println("The Item no " + p1.getItemno() + " which is " + p1.getName() + " are " + p1.getQty() + "remaining with price  " + p1.getPrice());

	}

}
