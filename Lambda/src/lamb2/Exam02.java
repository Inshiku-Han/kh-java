package lamb2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exam02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(lambdaSum(list, num -> num % 2 == 0));
		System.out.println(lambdaSum(list, num -> num % 2 != 0));
	}

	// 조건에 따른 정수의 합을 반환하는 기능
	public static int lambdaSum(List<Integer> list, Predicate<Integer> p) {
		int sum = 0;
		for (int e : list) {
			if (p.test(e)) {
				sum += e;
			}
		}

		return sum;
	}
}

//public class Exam02 {
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		System.out.println(sum(list));
//	}
//	
//	// 정수가 들어있는 리스트 중에서 짝수의 합을 리턴시키는 기능
//	public static int sum(List<Integer> list) {
//		int sum = 0;
//		for (int e : list) {
//			if (e % 2 == 0) {
//				sum += e;
//			}
//		}
//		
//		return sum;
//	}
//}
