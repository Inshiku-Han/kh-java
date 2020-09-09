package Exercise7_5;

public class Product {
private int price;
private int bonuspoint;

public Product() {
	
}
public Product(int price) {
	this.price = price;
	this.bonuspoint = (int)(price/10.0);
	
}
	

}

class Tv extends Product{
	public Tv() {
		
	}
	public Tv(int price) {
		super(price);
	}
	public String toString() {
		return "Tv";
	}
}