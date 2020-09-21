package string;

public class StringTest2 {
	public static void main(String[] args) {
		String s = "abcdef";

		// 문자열의 길이 .length()
		System.out.println(s.length() + "\n");

		// 문자열 연결 .concat()
		s.concat("ggg");
		System.out.println(s); // 문자열은 변하지 않는다.
		s = s.concat("ggg"); // 문자열 s를 주소이동
		System.out.println(s);

		// 문자열 일부 추출 .substring()
		s = "abcdef";
		s = s.substring(2); // n번째 열부터 끝까지 출력
		System.out.println(s);
		s = "abcdef";
		s = s.substring(2, 5); // n1 <= 문자열 < n2 범위
		System.out.println(s + "\n");

		// 숫자값을 문자열로 바꾸기 .valueOf()
		double e = 2.71;
		String se = String.valueOf(e); // 클래스명.스태틱메소드 형태 se = "2.71"이 된다.
		System.out.println(se + "\n");
		// 문자열 자르기(패턴) .split()
		String aa = "a,b,c,d,e,f";
		String[] bb = aa.split(","); // ,마다 다 자른다.

		System.out.println(bb[0]);
		System.out.println(bb[2]);
		System.out.println(bb[4]);
	}
}
