package variable;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.141592;
			//원의 반지름을 입력받아 원의 둘레와
			//넓이를 출력하세요
			//원의 둘레 = 2*PI*r
			//원의 넓이 = PI*r*r
			int r = 0;
			
			System.out.print("원의 반지름 = ");
			r = sc.nextInt();
			
			System.out.println("");
			
			double round = 2 * PI * r;
			double area = r * PI * r;
			
			System.out.println("원의 반지름이 " + r + "인");
			System.out.println("원의 둘레 = " + round + ", 원의 넓이 = " + area );
			sc.close();
	}

}
