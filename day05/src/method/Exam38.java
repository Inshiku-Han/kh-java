package method;

public class Exam38 {
public static void main(String[] args) {
	//6. ������ �迭�� �Ű������� �޾� �迭�� ��� ��� �� �ִ밪�� �����ϴ� �޼ҵ带 ����� ȣ���غ�����.
	int[] a = {1,3,2,4,5};
	System.out.println(max(a));
}

public static int max(int[] a) {
	int sum = 0;
	for(int i = 0; i < a.length; i++) {
		if(sum < a[i]) {
			sum = a[i];
		}
		
	}
	return sum;
}
}
