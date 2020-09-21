package Exercise3_1;

public class Exercise3_1 {
public static void main(String[] args) {
	int x = 2;
	int y = 5;
	char c = 'A';
	System.out.println(x + 1 << 33); // 이진법 이동
	System.out.println(y >= 5 || x < 0 && x > 2); // 맞다
	System.out.println(y += 10 - x++); // 8 + 5
	System.out.println(x+=2); // 위에서 1 증가했다. 5
	System.out.println( !('A' <= c && c <='Z') ); // ! 부정
	System.out.println('C'-c); // 문자코드 67 - 문자코드 65 = 2
	System.out.println('5'-'0');  // 문자코드 05 - 문자코드 00 = 5
	System.out.println(c+1); // 66
	System.out.println(++c); // B
	System.out.println(c++); // B
	System.out.println(c); // C

}
}
