package string;

public class StringTest1 {
	public static void main(String[] args) {
		// 1. String Ŭ������ ��ü�� ���� �� �ٲ۴�.
		String s1 = "abc";
		s1 = "sdf";
		String s2 = "abc"; // s2�� ���ڿ��� �̹� s1�� �־ s2�� s1���� �ּ��̵��Ѵ�.(s1==s2)
		String s3 = new String("abc"); // ��ü �������� ������ ��� ������ ��ü�� ����. s1!=s3

		s1.contentEquals(s2);
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
}
