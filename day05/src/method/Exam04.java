package method;

public class Exam04 {

	public static void main(String[] args) {
		int result = sum(1, 2); // sum(1,2)�� a+b��� ������ ������� ���� ���� int return���
		System.out.println(result);
		
		//double a = square(3.5);
		//System.out.println(a);
		
		System.out.println(square(3.5)); //�� �� �ٰ� ����(a�������� ��������)
	}
	
	public static int sum(int a, int b) { // �޼ҵ��� ����ȭ
		int sum = a + b;
		return sum;
	}
	public static double square(double num) {
		//double value = num*num;
		//return value; //�޼ҵ� �ڷ��� ������ return�ʿ�
		
		return num*num; //�� ���ٰ� ����(value �������� ��������)
	}
	//�޼ҵ带 ����϶� : return���x
	//Ư�� ����� ����or��ȯ�϶� : return���
}
