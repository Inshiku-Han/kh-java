package for_while;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.
//		(50, 50)과 (100, 100)의 두 점으로 이루어진 사각형이 있다고 하자.
//		이때 키보드로부터 한 점을 구성하는 정수 x와y값을 입력받고
//		점(x,y)가 이 직사각형 안에 있는지를 판별하는 프로그램 만들어라
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		System.out.print("x값 , y값 = ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x >=50 && x <= 100) {
			if(y >= 50 && y <= 100) {
				System.out.println("직사각형 안에 있다");
		}
		}else {
			System.out.println("직사각형 안에 없다");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
