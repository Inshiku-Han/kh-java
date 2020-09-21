package method;

public class Exam08 {
	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);
//		setValue(a);
//		System.out.println(a);
		
		int[] a = {1};
		System.out.println(a[0]);
		setValue1(a);
		System.out.println(a[0]); //배열에서의 대입=주소이동의 개념.
	}
	
	
	public static void setValue(int a) { //위 메소드에서 쓰이는 int a와 현 메소드에서 쓰이는 int a는 다름
		a = a+1;
		System.out.println(a);
	}
	public static void setValue1(int[] a) {
		a[0] = a[0] + 1;
		System.out.println(a[0]);
	}
}
