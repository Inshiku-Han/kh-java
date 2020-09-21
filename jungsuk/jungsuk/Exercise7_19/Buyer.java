package Exercise7_19;

public class Buyer {
	private int money = 1000;
	private Product[] cart = new Product[3];
	int i = 0;

	public Buyer() {
	}

	public void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}

	public void add(Product p) {
		if (i >= cart.length) {
			Product[] tmp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++] = p;
	}

	public void summary() {
		String itemList = "";
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			itemList += cart[i] + ", ";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	}
}

class Product {
	int price;

	public Product(int price) {
		super();
		this.price = price;
	}

}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}