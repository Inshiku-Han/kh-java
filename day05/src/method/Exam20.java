package method;

public class Exam20 {
public static void main(String[] args) {
	//17. �� ������ �Ű������� �޾�, �� ���� ������ ��� ���ڸ� ����ϴ� �޼ҵ带 �����ϰ� ȣ���غ�����.
	arr(120, 150);
}

public static void arr(int a, int b) {
	int[] c = new int[b-a];
	for(int i = 0; i < c.length-1; i++) {
		
			c[i] = a+(i+1);
			System.out.println(c[i]);
		
	}
}
}
