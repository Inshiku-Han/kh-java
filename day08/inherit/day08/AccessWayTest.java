package day08;

public class AccessWayTest {
public static void main(String[] args) {
//	AccessWay a = new AccessWay();
//	AccessWay b = new AccessWay();
	AccessWay.num++; // Ŭ����.���� ���·� ����ƽ ������ ���� . ��ü�� �������� �ʾƵ� static�� ���� ����
//	System.out.println(a.num);
//	System.out.println(b.num);
	
	Math.random(); // �̰ŵ� static ����
	Math.max(2, 3);
	System.out.println(Math.max(2, 3));
}
}

class AccessWay{
	static int num; // �������� ����ϴ� ����
	
	static { // static �ʱ�ȭ ����
		num = 0;
	}
	public AccessWay() {
		
	}
}
