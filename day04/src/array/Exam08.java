package array;

public class Exam08 {

	public static void main(String[] args) {
//		Math.random(); �̶�� �޼ҵ尡 �ִ�. �� �޼ҵ�� 0.0 <= �޼ҵ� < 1.0 ���� ������ �Ǽ� �� ������ ���� �������ش�. 
//		���� ��� double d = Math.random();�� �ϸ�  0.0 <= d < 1.0 �� ������ �Ǽ� ���� d�� �Ҵ�ȴ�.
//		�̸� Ȱ���Ͽ� ������ ���� I�� 50 <= I < 100 �� ������ ������ �����غ���.(�迭�����ƴ�)

//		�� ���� ����

//		int i = (int)(Math.random() * 50+50);
		// System.out.println(i);

		// 1~45������ ���� ��
//		int rand = 0;
//		rand = (int) (Math.random() * 45 + 1);
//		System.out.println(rand);

		// �ζ� ������
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int rand = (int) (Math.random() * 45 + 1);
			lotto[i] = rand;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");

		}

	}

}
