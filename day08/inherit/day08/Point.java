package day08;

 // 상속
public class Point {

	int x;
	int y;
	
	public void bbb() {
		
	}
}

class Point3D extends Point{ // Point클래스를 확장해서 Point3D에 사용 = Point를 Point3D클래스에 상속
	int z;
	
	public void aaa() { // Point3D 클래스에는 x,y변수가 없지만 Point가 상속되어서 Point의 변수 사용가능
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		x = 10;
		bbb();
	}
}
