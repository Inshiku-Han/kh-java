package instanceOf;

public class BuyTest { // �ڹ��� ���� (1) 370p ������
public static void main(String[] args) {
	Buyer b = new Buyer();
	Product[] p = new Product[3];
	p[0] = new Tv();
	p[1] = new Computer();
	p[2] = new Audio();
	
	b.buy(p[0]);
	b.buy(p[1]);
	b.buy(p[2]);
	
	
	
	
}
}
