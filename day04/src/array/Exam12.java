package array;

public class Exam12 {

	public static void main(String[] args) {
		// ���� 10���� ���� �� �ִ� �迭�� �����ϰ�, Math.random() �Լ��� ����Ͽ� 1 ~ 100�� ������ �迭 �� ��ҿ� ��������
		// �迭�� ����� ��� ���� �� �ּҰ�, �ִ밪�� ����غ���
		int[] rand = new int[10];
		int min = 100;
		int max = 0;

		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 100 + 1);
			if (max < rand[i]) {
				max = rand[i];
			}
			if (min > rand[i]) {
				min = rand[i];
			}
			System.out.print(rand[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ밪 = " + max + " " + "�ּҰ� = " + min);
		System.out.println();

		// for-each���� ���
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 100 + 1);
		}
		for (int e : rand) { //�迭�� ���� ������ �� for-each�� ���
			System.out.print(e + " ");
			if (e > max) {
				max = e;
			}
			if (e < min) {
				min = e;
			}
		}
		System.out.println();
		System.out.println("�ִ밪 = " + max + " " + "�ּҰ� = " + min);

	}
}
