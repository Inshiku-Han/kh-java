package variable;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//�̸��� ���̸� �Է¹޾�, ȭ�鿡 ���
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println("�Է��Ͻ� �̸��� : " + name);
		System.out.println("�Է��Ͻ� ���̴� : " + age);
		sc.close();
	}

}
