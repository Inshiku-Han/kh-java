package method;

public class Exam36 {
public static void main(String[] args) {
	//4. ���� �ϳ��� �Ű������� �޾�, �Ű������� ¦���� true, Ȧ���� false�� �����ϴ� �޼ҵ带 ����� Ȱ���غ���.
	
	System.out.println(judge(99));
}


public static boolean judge(int a) {
	return a % 2 == 0 ? true : false;
}
}
