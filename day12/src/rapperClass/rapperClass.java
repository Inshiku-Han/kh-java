package rapperClass;

public class rapperClass {
	public static void main(String[] args) {
		Integer i =  new Integer(10); // 인트 클래스
		int a = i.intValue(); // 인트 메소드를 기본자료형화
		int b = i; // intValue없이도 가능
		
		Double d = 3.14; // 오토 박싱(클래스화)
		double dd = d; // 오토언박싱(자료화)
		
		
		//숫자를 문자로 or 문자를 숫자로
		int a1 = Integer.parseInt("1");
		int a2 = Integer.parseInt("111");
		double d1 = Double.parseDouble("11.11");
		System.out.println(a1 + 9);
		System.out.println(a2 + 889);
		System.out.println(d1 + 88.89);
		
		String s1 = String.valueOf(50);
		System.out.println(s1 + 10);
	}
}
