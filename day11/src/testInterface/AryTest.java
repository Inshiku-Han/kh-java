package testInterface;

public class AryTest {
public static void main(String[] args) {
	ArrayUtil ar = new Ary();
	int[] arr1 = {10,8,6,4,2};
	int[] arr2 = {9,7,5,3};
	System.out.println(ar.getArraySum(arr1));
	System.out.println(ar.getArrayMin(arr2));
	System.out.println(ar.getArraySub(arr1, arr2));
	
}
}
