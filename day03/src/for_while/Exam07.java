package for_while;

import java.util.Scanner;


public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.print("3�� �Է��ϼ��� : ");
			num = sc.nextInt();
			if(num == 3) {
				System.out.println("�Ϸ�");
				break;
			}
		}
		
		
		
		sc.close();
	}

}
