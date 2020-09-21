package array;

public class Exam08 {

	public static void main(String[] args) {
//		Math.random(); 이라는 메소드가 있다. 이 메소드는 0.0 <= 메소드 < 1.0 까지 사이의 실수 중 랜덤한 수를 전달해준다. 
//		예를 들어 double d = Math.random();을 하면  0.0 <= d < 1.0 중 임의의 실수 값이 d에 할당된다.
//		이를 활용하여 정수형 변수 I에 50 <= I < 100 의 임의의 정수를 저장해보라.(배열문제아님)

//		셤 나올 수도

//		int i = (int)(Math.random() * 50+50);
		// System.out.println(i);

		// 1~45까지의 랜덤 수
//		int rand = 0;
//		rand = (int) (Math.random() * 45 + 1);
//		System.out.println(rand);

		// 로또 생성기
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int rand = (int) (Math.random() * 45 + 1);
			lotto[i] = rand;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");

		}

	}

}
