package method;

public class Exam34 {
public static void main(String[] args) {
	//3. ���� �ϳ��� �Ű������� �޾�, 1 ~ 100������ �� �߿��� �Ű������� ���� ���� ����� ����ϴ� �޼ҵ带 ����� ȣ���غ�����.
	num(9);
}
public static void num(int a) {
	for(int i = 1; i < 100; i++) {
		if(i % a == 0) {
			System.out.println(i);
		}
	}
	
}
}
