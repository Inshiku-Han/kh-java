package test2;

import test1.A;

public class C { // �ٸ� ��Ű�������� ���� ����. public class�� �ݵ�� ���ϸ�� ���ƾ��Ѵ�. public class�� ���ϴ� �ϳ��� �����ϴ�.
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
//		System.out.println(a.b); // �ٸ� ��Ű���� ���� �Ұ�
		
	}
}
class Cc extends A{ // ���� ��Ű���������� ���� ����
	public void aa() {
	}
	
}
