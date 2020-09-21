package fieldClass;

public class TvTest {

	public static void main(String[] args) { // 메인메소드는 실행용.
		Tv tv1; // Tv형 변수 선언
		tv1 = new Tv(); // tv 객체 생성. new는 객체 생성의미

		Tv tv2 = new Tv();

		// 멤버변수에 접근방법
		System.out.println(tv1.channel); // 0
		tv1.channel = 10;
		System.out.println(tv1.channel); // 10
		tv1.channelDown();
		System.out.println(tv1.channel); // 9
		System.out.println(tv2.channel); // 0 tv1과 tv2는 독립
		
		System.out.println();
		tv2 = tv1; // 주소복사. 배열과 개념이 같다
		System.out.println(tv1.channel); // 9
		System.out.println(tv2.channel); // 9 
		tv1.channelUp();
		System.out.println(tv1.channel); // 10
		System.out.println(tv2.channel); // 10
		tv2.channelUp();
		System.out.println(tv1.channel); // 11
		System.out.println(tv2.channel); // 11
	}

}
