package testInterface;

public class Ary implements ArrayUtil {

	@Override
	public int getArraySum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	@Override
	public int getArrayMin(int[] arr) {

		int min = 100;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	@Override
	public int getArraySub(int[] arr1, int[] arr2) {

		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}

		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum2 += arr2[i];
		}
		int sub = sum1 - sum2;
		return sub;
	}

}
