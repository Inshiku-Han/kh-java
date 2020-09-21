package julyFourteenth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();

		for (;;) {
			set.add((int) (Math.random() * 9));
			if (set.size() >= 3) {
				break;
			}
		}
		List<Integer> list = new ArrayList<Integer>(set);
		for (int e : list) {
			System.out.print(e);
		}

		for (;;) {
			System.out.print(" 숫자 입력 ==>");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			List<Integer> list2 = new ArrayList<Integer>();
			list2.add(num1);
			list2.add(num2);
			list2.add(num3);
			int strike = 0;
			int ball = 0;
			int cnt = 1;
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
					if (list.get(i) == list2.get(j)) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			cnt++;
			System.out.println(strike + "S " + ball + "B\n");
			if (strike == 3) {
				System.out.println(cnt + "번만에 맞췄군요!");
				break;
			}
		}
		sc.close();
	}
}