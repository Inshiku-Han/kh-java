package day08;

 // ���
public class Point {

	int x;
	int y;
	
	public void bbb() {
		
	}
}

class Point3D extends Point{ // PointŬ������ Ȯ���ؼ� Point3D�� ��� = Point�� Point3DŬ������ ���
	int z;
	
	public void aaa() { // Point3D Ŭ�������� x,y������ ������ Point�� ��ӵǾ Point�� ���� ��밡��
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		x = 10;
		bbb();
	}
}
