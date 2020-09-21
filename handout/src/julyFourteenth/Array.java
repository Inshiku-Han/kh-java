package julyFourteenth;

import java.util.Scanner;

public class Array {
	Scanner sc;
	int[] arr;

	public Array() {
		sc = new Scanner(System.in);

	}

	public void start() {
		System.out.print("������ �迭�� ũ�⸦ �Է����ּ��� =>");
		int num = sc.nextInt();
		arr = new int[num];
		System.out.println("ũ�Ⱑ " + num + "�� �迭�� �����Ǿ����ϴ�.");
		result();
	}

	public void result() {
		System.out.print("���� �迭�� ����� ���� ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("�Դϴ�.\n");
	}

	public void save() {
		System.out.print("���� �� �� : ");
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = num;
				return;
			}
		}
	}

	public void delete() {
		System.out.print("������ ��� ��ȣ : ");
		int num = sc.nextInt();

		if (arr[num - 1] != 0) {
			System.out.println("�����Ͽ����ϴ�.");
			arr[num - 1] = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i == 4) {
					break;
				}
				arr[i] = arr[i + 1];
			}

		} else if (arr[num - 1] == 0) {
			System.out.println(num + "��° ��Ҵ� �����Ͱ� �����ϴ�.");

		}

	}

	public void exitProgram() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
