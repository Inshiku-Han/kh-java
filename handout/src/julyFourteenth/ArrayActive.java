package julyFourteenth;

import java.util.Scanner;

public class ArrayActive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array array = new Array();
		System.out.println("���α׷��� �����߽��ϴ�.");
		array.start();
		while (true) {
			System.out.print("1. �� ����\t2. �� ����\t3. ���α׷� ���� =>");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				array.save();
				array.result();
				break;
			case 2:
				array.delete();
				array.result();
				break;
			case 3:
				sc.close();
				array.exitProgram();
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");

			}
		}
	}
}
