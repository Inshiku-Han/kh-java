package array;

public class Exam03 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);

		for (int i = 0; i < arr1.length; i++) { // 배열 길이만큼 반복. 습관화
			System.out.println(arr1[i]); // 0이 100개
		} // 배열과 for는 같이 쓴다

		System.out.println();

		for (int j = 0; j < arr1.length; j++) {
			arr1[j] = 10;
			System.out.println(arr1[j]); // 10이 100개
		}

		System.out.println();
		System.out.println(arr1.length); // 배열의 길이

	}

}
