package variable;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
//		��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
//		��ĳ�ʷ� ������ �Է¹ޱ�
		a = sc.nextInt();
		System.out.println("a = " + a);
		
//		��ĳ�ʷ� ���ڿ� �Է¹ޱ�
		String str;
		sc.nextLine();
		str = sc.nextLine();
		System.out.println("str = " + str);
		sc.close();
	}

} 
