package MethodOverriding;
 // ���ۿ� java api 8 : ��ɻ���
public class Work {
public static void main(String[] args) {
	B bp = new B();
	B bp1 = new B(10);
	B bp2 = new B(10,20);
	B bp3 = new B(10,20,30);
	B bp4 = new B(10,20,30,40);
	bp.disp();
	bp1.disp();
	bp2.disp();
	bp3.disp();
	bp4.disp();
	
	
}
}
