package variable;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		//�л��� ���������� �Է��ϰ�, �Էµ� ������ ����ϴ� ���α׷�
		//�� ����� ����.
		//�л��� ���������� �̸�, ����, ��,��,�� ����, ����, �����
		//������.
		//��� ������ �Է¹޾�, �Է¹��� ������ �ٽ� ����ϴ� ���α׷�
		//�� �ϼ��ϼ���.
		//��, �̸��� �������� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		String name;
		int age = 0;
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		System.out.print("���̸� �Է����ּ��� : ");
		age = sc.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		korScore = sc.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		engScore = sc.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		mathScore = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸��� �Է����ּ��� : ");
		name = sc.nextLine();	//���� sc.nextLine();�� ����� name = sc.next();�� ����
		
		System.out.println();
		System.out.println("���");
		
		totalScore = korScore + engScore + mathScore;
		avg = totalScore / 3.0;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�������� : " + korScore);
		System.out.println("�������� : " + engScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("���� : " + totalScore);
		System.out.println("��� : " + avg);
		System.out.println("��� : " + String.format("%.2f" , avg));
		System.out.println("��� : " + String.format("%.3f" , avg));
		System.out.println("��� : " + Math.round(avg*100)/100.0);
		System.out.println("��� : " + Math.round(avg*1000)/1000.0);
//		Math.round(double * 10n) / 10n.0�Լ��� �Ҽ����Ʒ��� 0�ϰ�� ���������� 
//		String.format("%.nf" , double)�� �������� �ʰ� �״�� �����մϴ�
		sc.close();
		
	}

}
