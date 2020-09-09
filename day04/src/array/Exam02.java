package array;

public class Exam02 {

	public static void main(String[] args) {

		//정수 5개 공간의 배열 , 필수
		int[] num = new int[5]; // 0 0 0 0 0
		//문자열 5개 공간의 배열 , 필수
		String[] str = new String[5]; // null null null null null
		//실수 5개 공간의 배열 , 필수
		double[] d = new double[3]; // 0.0 0.0 0.0
		//문자 5개 공간의 배열
		char[] c = new char[5]; //잘 안써
		boolean[] b = new boolean[2]; // false false 잘 안써
		
		System.out.println("num[0] = " + num[0]);
		System.out.println("str[0] = " + str[0]);
		System.out.println("d[0] = " + d[0]);
		System.out.println("c[0] = " + c[0]);
		System.out.println("b[0] = " + b[0]);
		
		int[] arr1 = {1, 2, 3};
		double[] arr2 = {1.2, 3.5, 5.7};
		String[] arr3 = {"abc", "efg", "hij"};
	}

}
