package variable;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//가로길이와 세로길이를 입력받아,
		//사각형의 넓이를 구하시오.
		//사각형의 넓이 = 가로*세로
		int width = 0;
		int height = 0;
		int result = 0;
		
		System.out.print("사각형의 가로길이 = ");
		width = sc.nextInt();
		System.out.print("사각형의 세로길이 = ");
		height = sc.nextInt();
		
		result = width * height;
		
		System.out.println("");
		
		System.out.println("사각형의 넓이 = " + result);
		sc.close();//위 sc의 노란줄 사라짐
		
		
		
	}

}
