package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(sc.nextDouble());
		}
		double max = 0;
		for (int i = 0; i < 10; i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(max);
		sc.close();
	}
}
