package for_while;

public class Test01 {

	public static void main(String[] args) {
		int a1 = 50;
		int b1 = 50;
		int c1 = a1 + b1;

		if (c1 > 50) {
			System.out.println("두 수의 합이 50보다 큽니다");
		} else {
			System.out.println("두 수의 합이 50보다 작습니다");
		}

		int a2 = 3;

		if ((a2 % 2) == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}

		int a3 = 0;
		int b3 = 0;

		if (a3 > b3) {
			System.out.println("a가 큽니다");
		} else if (a3 < b3) {
			System.out.println("b가 큽니다");
		} else {
			System.out.println("같습니다");
		}
		
		int a4 = 0;
		
		if((a4 % 3) == 0) {
			System.out.println("3의 배수입니다");
		}
		
		int a5 = 77;
		
		if(a5 > 90 && a5 <= 100) {
			System.out.println("학점은 A입니다");
		}else if (a5 > 80) {
			System.out.println("학점은 B입니다");
		}else {
			System.out.println("학점은 C입니다");
		}
	}
}
