package array;

public class Exam02 {

	public static void main(String[] args) {

		//���� 5�� ������ �迭 , �ʼ�
		int[] num = new int[5]; // 0 0 0 0 0
		//���ڿ� 5�� ������ �迭 , �ʼ�
		String[] str = new String[5]; // null null null null null
		//�Ǽ� 5�� ������ �迭 , �ʼ�
		double[] d = new double[3]; // 0.0 0.0 0.0
		//���� 5�� ������ �迭
		char[] c = new char[5]; //�� �Ƚ�
		boolean[] b = new boolean[2]; // false false �� �Ƚ�
		
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
