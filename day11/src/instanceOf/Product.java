package instanceOf;

public class Product {
	int price;
	int bonusPoint;
}

class Tv extends Product {
	int inch;
}

class Computer extends Product {
	String cpu;
}

class Audio extends Product {
	int volume;
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	public void buy(Product p) {
		// �ݾ� ��� �� ����Ʈ ���
		this.money = money - p.price;
		System.out.println(money);

		// p�� ��ǻ���� ��ü�϶���
		if (p instanceof Computer) {
			Computer c = (Computer) p;
			System.out.println(c.cpu);

		}

	}
}