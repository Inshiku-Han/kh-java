package method;

public class Exam06 {

	public static void main(String[] args) {
		int b = 20; //�� int b�� main�޼ҵ� �ȿ��� ����. �޼ҵ�ȿ��� ����� ������ ��������(local variable)�̶� ��
					//�������� �� �⺻�ڷ����� �ʱ�ȭ �ʿ�. ex)0, 0.0 ��
		if(10 > 5) {
			int a = 10; //�� int a�� if�� �ȿ����� ����. if�� �ۿ����� ��� �Ұ�
			System.out.println(a);
			System.out.println(b);
		}
//		System.out.println(a);
		System.out.println(b);
		
	}

}
