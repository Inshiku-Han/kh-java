package fieldClass;

public class TvTest {

	public static void main(String[] args) { // ���θ޼ҵ�� �����.
		Tv tv1; // Tv�� ���� ����
		tv1 = new Tv(); // tv ��ü ����. new�� ��ü �����ǹ�

		Tv tv2 = new Tv();

		// ��������� ���ٹ��
		System.out.println(tv1.channel); // 0
		tv1.channel = 10;
		System.out.println(tv1.channel); // 10
		tv1.channelDown();
		System.out.println(tv1.channel); // 9
		System.out.println(tv2.channel); // 0 tv1�� tv2�� ����
		
		System.out.println();
		tv2 = tv1; // �ּҺ���. �迭�� ������ ����
		System.out.println(tv1.channel); // 9
		System.out.println(tv2.channel); // 9 
		tv1.channelUp();
		System.out.println(tv1.channel); // 10
		System.out.println(tv2.channel); // 10
		tv2.channelUp();
		System.out.println(tv1.channel); // 11
		System.out.println(tv2.channel); // 11
	}

}
