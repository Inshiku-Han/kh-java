package if_switch;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 0~100������ ���� �ϳ��� �Է¹޾�,
		// �� ���� 90~100�� ���̸� A�� ���
		// �� ���� 80~90�� ���̸� B�� ���
		// �� ���� 70~80�� ���̸� C�� ���
		// �� ���� 70�� �̸��̸� D�� ���
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		
		System.out.print("������ �Է��� �ּ��� : ");
		num = sc.nextInt();
		
//		if(num >=90) {
//			System.out.println("A");
//		}else if(num >=80 && num < 90) {
//			System.out.println("B");
//		}	
//			else if(num >=70 && num < 80) {
//				System.out.println("C");
//		}else {
//			System.out.println("D");
//		} // ��
		
		if(num >= 90) {
			str = "A";
		}else if(num >= 80) {
			str = "B";
		}else if(num >= 70) {
			str = "C";
		}else {
			str = "D";
		}
		System.out.println(str); // �ؼ�
		sc.close();
	}

}
