package for_while;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		int num = 0;
		
		System.out.print("�Է� : ");
		num = sc.nextInt();
		
		if(num % 5 != 0) {
			System.out.println("5�� ����� �Է��ϼ���");
		}
		sc.close();
	}

}
