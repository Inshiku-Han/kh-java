package Exercise3_1;

public class Exercise3_1 {
public static void main(String[] args) {
	int x = 2;
	int y = 5;
	char c = 'A';
	System.out.println(x + 1 << 33); // ������ �̵�
	System.out.println(y >= 5 || x < 0 && x > 2); // �´�
	System.out.println(y += 10 - x++); // 8 + 5
	System.out.println(x+=2); // ������ 1 �����ߴ�. 5
	System.out.println( !('A' <= c && c <='Z') ); // ! ����
	System.out.println('C'-c); // �����ڵ� 67 - �����ڵ� 65 = 2
	System.out.println('5'-'0');  // �����ڵ� 05 - �����ڵ� 00 = 5
	System.out.println(c+1); // 66
	System.out.println(++c); // B
	System.out.println(c++); // B
	System.out.println(c); // C

}
}
