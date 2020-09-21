package array;

public class Exam06 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		int[] newArr = new int[5];

		// newArr = arr;

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]); // 위 for의 변수를 밑 for의 변수에 사용
		}

		
		System.out.println("\n");
		
		int[] arrr = { 5, 4, 3, 2, 1 };
		int[] newArrr = arrr; // newArrr가 arrr을 나타낸다. 기존newArrr은 삭제
		
		newArrr[0] = 0; // newArrr의 값을 변경 = arrr의 값을 변경
		
		System.out.println(arrr[0]);
		System.out.println(newArrr[0]);
		System.out.println(arrr);
		System.out.println(newArrr); // 두 개의 주소가 같다

	}
}
