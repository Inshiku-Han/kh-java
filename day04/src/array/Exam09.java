package array;

public class Exam09 {

	public static void main(String[] args) {

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		// 최댓값 도출
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];

			}

		}

		System.out.println("max : " + max);

	}

}
