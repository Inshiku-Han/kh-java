package method;

public class Exam27 {
public static void main(String[] args) {
	//5. ������ ������ �Ű������� �޾�, ���� �Ű������� ���� ������ 90 �̻��̸� ��A��, 70 �̻��̸� ��B��
	//   �� ���� ���� ������ ��C���� �����ϴ� �޼ҵ带 �����ϰ� ����غ�����.
	
	System.out.println(score(30)); //������ ����
}

public static String score(int a) {
	String b = null;
	if(a >= 90) {
		b = "A";
	}else if(a >= 70) {
		b = "B";
	}else {
		b = "C";
	}
	return b;
}

}
