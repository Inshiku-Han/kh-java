package if_switch;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int max = 0;
		int min = 0;

		System.out.print("ù��° �� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		num2 = sc.nextInt();

		System.out.println();
		
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " > " + num1);
		} else if (num1 == num2) {
			System.out.println("����"); // ��
		}
		
		System.out.println();
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
			System.out.println(max + ">" + min); // �ؼ�
		sc.close();
	}

}
