package study;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		
//		System.out.println(c1.kind + c1.number + c1.width + c1.height);
//		System.out.println(c2.kind + c2.number + c2.width + c2.height);
//		c1.width = 50;
//		c1.height = 80;
//		System.out.println(c1.kind + c1.number + c1.width + c1.height);
//		System.out.println(c2.kind + c2.number + c2.width + c2.height); 
//		Ŭ���������� �����ϱ⶧���� c1�� width,height�� �����ϸ� c2�� ����ȴ�.
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
