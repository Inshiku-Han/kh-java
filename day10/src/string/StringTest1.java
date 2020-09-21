package string;

public class StringTest1 {
	public static void main(String[] args) {
		// 1. String 클래스의 객체는 값을 못 바꾼다.
		String s1 = "abc";
		s1 = "sdf";
		String s2 = "abc"; // s2의 문자열이 이미 s1에 있어서 s2를 s1으로 주소이동한다.(s1==s2)
		String s3 = new String("abc"); // 객체 생성으로 선언할 경우 독립된 개체로 본다. s1!=s3

		s1.contentEquals(s2);
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
}
