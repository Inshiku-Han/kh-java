package variable;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���α��̿� ���α��̸� �Է¹޾�,
		//�簢���� ���̸� ���Ͻÿ�.
		//�簢���� ���� = ����*����
		int width = 0;
		int height = 0;
		int result = 0;
		
		System.out.print("�簢���� ���α��� = ");
		width = sc.nextInt();
		System.out.print("�簢���� ���α��� = ");
		height = sc.nextInt();
		
		result = width * height;
		
		System.out.println("");
		
		System.out.println("�簢���� ���� = " + result);
		sc.close();//�� sc�� ����� �����
		
		
		
	}

}
