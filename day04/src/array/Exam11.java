package array;

public class Exam11 {
	public static void main(String[] args) {
		// Enhanced for문
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n");

		// for-each
		for (int e : arr) {
			// int e = 1;
			// int e = 2;
			// int e = 3;
			// int e = 4;
			// int e = 5;
			System.out.print(e + " ");
		}

		System.out.println("\n");

		String[] arr1 = { "자바", "C언어", "C++", "Python" };

		for (String e : arr1) {
			System.out.print(e + " ");
		}

	}
}
