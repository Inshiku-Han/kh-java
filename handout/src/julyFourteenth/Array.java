package julyFourteenth;

import java.util.Scanner;

public class Array {
	Scanner sc;
	int[] arr;

	public Array() {
		sc = new Scanner(System.in);

	}

	public void start() {
		System.out.print("생성할 배열의 크기를 입력해주세요 =>");
		int num = sc.nextInt();
		arr = new int[num];
		System.out.println("크기가 " + num + "인 배열이 생성되었습니다.");
		result();
	}

	public void result() {
		System.out.print("현재 배열에 저장된 값은 ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("입니다.\n");
	}

	public void save() {
		System.out.print("저장 할 값 : ");
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = num;
				return;
			}
		}
	}

	public void delete() {
		System.out.print("삭제할 요소 번호 : ");
		int num = sc.nextInt();

		if (arr[num - 1] != 0) {
			System.out.println("삭제하였습니다.");
			arr[num - 1] = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i == 4) {
					break;
				}
				arr[i] = arr[i + 1];
			}

		} else if (arr[num - 1] == 0) {
			System.out.println(num + "번째 요소는 데이터가 없습니다.");

		}

	}

	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
