package exception;


import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//���ܰ� �Ͼ �� ���� �ڵ� �ۼ�
			System.out.print("�����Է� : ");
			int a = sc.nextInt();
			System.out.println("a = " + a);
		}catch(Exception e) {
			//���� �߻� �� ������ �ڵ�
		System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
//		
//		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");

//		Exception e �� ��� Exception Ŭ������ ����(����)
//		try {
//			System.out.println(5/0);
//		}catch(Exception e) {
//			System.out.println(e.getMessage()); // ���� ���� ���
//			System.out.println();
////			e.printStackTrace(); // ���� ���. try-catch������ ���������� �߻����� �ʾ� �� �޼ҵ�� �����ؾ��Ѵ�.
//		}
//		System.out.println("���� ����");
		sc.close();
	}

}
