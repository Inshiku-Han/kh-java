package string;

public class StringTest2 {
	public static void main(String[] args) {
		String s = "abcdef";

		// ���ڿ��� ���� .length()
		System.out.println(s.length() + "\n");

		// ���ڿ� ���� .concat()
		s.concat("ggg");
		System.out.println(s); // ���ڿ��� ������ �ʴ´�.
		s = s.concat("ggg"); // ���ڿ� s�� �ּ��̵�
		System.out.println(s);

		// ���ڿ� �Ϻ� ���� .substring()
		s = "abcdef";
		s = s.substring(2); // n��° ������ ������ ���
		System.out.println(s);
		s = "abcdef";
		s = s.substring(2, 5); // n1 <= ���ڿ� < n2 ����
		System.out.println(s + "\n");

		// ���ڰ��� ���ڿ��� �ٲٱ� .valueOf()
		double e = 2.71;
		String se = String.valueOf(e); // Ŭ������.����ƽ�޼ҵ� ���� se = "2.71"�� �ȴ�.
		System.out.println(se + "\n");
		// ���ڿ� �ڸ���(����) .split()
		String aa = "a,b,c,d,e,f";
		String[] bb = aa.split(","); // ,���� �� �ڸ���.

		System.out.println(bb[0]);
		System.out.println(bb[2]);
		System.out.println(bb[4]);
	}
}
