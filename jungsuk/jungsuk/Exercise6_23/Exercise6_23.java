package Exercise6_23;

public class Exercise6_23 {
	
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)
		return -999999;
		int max = arr[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
		for(int i=1; i< arr.length;i++) { // �迭�� �� ��° ������ ���Ѵ�.
		if(arr[i] > max)
		max = arr[i];
		}
		return max;
		}


	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪 :" + max(data));
		System.out.println("�ִ밪 :" + max(null));
		System.out.println("�ִ밪 :" + max(new int[] {}));

	}

}
