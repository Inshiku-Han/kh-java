package testInterface;

public interface ArrayUtil {
	//매개변수로 받은 정수형 배열의 모든 요소의 합을 리턴한다.
	int getArraySum(int[] arr);
	//매개변수로 받은 배열 요소중 최솟값을 리턴한다.
	int getArrayMin(int[] arr);
	//매개변수로 받은 두 배열의 모든 요소의 합의 차를 리턴한다.
	int getArraySub(int[] arr1, int[] arr2);
}
