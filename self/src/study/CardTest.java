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
//		클래스변수를 공유하기때문에 c1의 width,height를 변경하면 c2도 변경된다.
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
