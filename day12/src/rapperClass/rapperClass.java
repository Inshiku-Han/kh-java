package rapperClass;

public class rapperClass {
	public static void main(String[] args) {
		Integer i =  new Integer(10); // ��Ʈ Ŭ����
		int a = i.intValue(); // ��Ʈ �޼ҵ带 �⺻�ڷ���ȭ
		int b = i; // intValue���̵� ����
		
		Double d = 3.14; // ���� �ڽ�(Ŭ����ȭ)
		double dd = d; // �����ڽ�(�ڷ�ȭ)
		
		
		//���ڸ� ���ڷ� or ���ڸ� ���ڷ�
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
