package haninsik01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int third = sc.nextInt();
		int box = 0;
		if (second > first && second > third) {
			box = first;
			first = second;
			second = box;
		} else if (third > first && third > second) {
			box = first;
			first = third;
			third = box;
		}
		if (third > second) {
			box = second;
			second = third;
			third = box;
		}
		System.out.println(first + " > " + second + " > " + third);
		sc.close();
	}

}
