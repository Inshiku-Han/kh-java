package lamb;

public class LambdaTest10 {

	public static void main(String[] args) {
		Min min = (a, b) -> System.out.println("�� �� �� ���� �� = " + (a > b ? b : a));
		min.min(3, 5);
		
		Max max = (a, b) -> a > b ? a : b;
		System.out.println("�� �� �� ū �� = " + max.max(3, 5));

		Square square = a -> a * a;
		System.out.println("���簢���� ���� = " + square.square(20));
		
		getArraySum arraySum = a -> {
			int sum = 0;
			for(int e : a) {
				sum += e;
			}
			return sum;
		};
		System.out.println("�迭�� ��� ����� �� = " + arraySum.sum(new int[] {10, 20, 30, 40}));
		
	}

}

interface Min{
	//�Ű������� ���� �� �� �� ���� ���� ����ϴ� ���
	void min(int a, int b);
}

interface Max{
	//�Ű������� ���� �� �� �� ū ���� �����ϴ� ���
	int max(int a, int b);
}

interface Square{
	//�Ѻ��� ���̰� a�� ���簢���� ���̸� �����ϴ� ���
	int square(int a);
}

interface getArraySum{
	//�Ű������� ���� �迭�� ��� ����� ���� ����
	int sum(int[] a);
}