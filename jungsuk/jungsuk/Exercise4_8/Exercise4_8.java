package Exercise4_8;

public class Exercise4_8 {

	public static void main(String[] args) {
//		방정식  2x+4y=10의 모든 해를 구하시오. 각각의 범위는0<=x<=10, 0<=y<=10 정수
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x = " + x + " , " + "y = " + y);
				}
			}
		}

	}

}
