package for_while;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
//		do while��
		
//		int num = 1;
//		
//		while(num < 11) {
//			System.out.println(num);
//			num = num + 1;
//		}
//		
//		System.out.println();
//		
//		for(int i = 1; i < 11 ; i++) {
//			System.out.println(i);
//		}
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
//		while(true) {
//			System.out.print("���� �Է� : ");
//			num = sc.nextInt();
//			if(num >= 0 && num <= 100) {
//				break;
//			}
//		}
		
		do  {         // do ������ ����, while�� true�̸� �ٽ� do ���� , ���� �˻縦 ���߿� Ȯ���ؼ� false���� �ѹ��� ����
			System.out.print("���� �Է� : "); // do while�� �� �Ⱦ�
			num = sc.nextInt();
		}while(num < 0 || num > 100);    // 0~100�� ��� ��
		
		
		sc.close();
		
	}

}
