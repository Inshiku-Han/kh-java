package julyFourteenth;

import java.util.Scanner;

public class HiddenCard {

	public static void main(String[] args) {
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
		Scanner sc = new Scanner(System.in);
		int hidden = 25;
		int min = 0;
		int max = 99;
		int i = 0;
		String answer = null;
		for (;;) {
			++i;
			int num = 0;
			if (max == 99 && min == 0) {
				System.out.println(min + "-" + max);
			}
			System.out.print(i + ">>");
			num = sc.nextInt();
			if (num > hidden) {
				System.out.println("�� ����");
				max = num;
				System.out.println(min + "-" + max);
			}
			if (num < hidden) {
				System.out.println("�� ����");
				min = num;
				System.out.println(min + "-" + max);
			}
			if (num == hidden) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)");
				sc.nextLine();
				answer = sc.nextLine();
				if (answer.equals("y")) {
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
					min = 0;
					max = 99;
					i = 0;
					hidden = 48;
				} else if (answer.equals("n")) {
					sc.close();
					return;
				}
			}
		}

	}

}
