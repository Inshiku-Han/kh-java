package Circle;

	//	생성자, 메소드는 전부 public, 변수는 전부 private 쓰는 것이 좋다

public class Circle {
	//반지름, PI
	private int r; // (private 변수) 를 사용하면 이 클래스에서만 사용가능. public이 들어가는 곳에는 다 변경가능
					// 변수값의 설정을 메소드를 통해서만 변경하게 하기 위해 private를 쓰는 것이 좋다
	 final double PI = 3.14;
	//생성자
	public Circle() {
		
	}
	//반지름을 변경하는 메소드
	public void setR(int r) {
		if(r < 0) { // 마이너스값 방지
			r = r * -1;
		}
		this.r = r;
	}
	//반지름 값을 읽어오는 메소드
	public int getR() {
		return r;
		
	}
	//원의 넓이를 출력하는 메소드
	public void display() {
		System.out.println("원의 둘레 = " + (2*r*PI));
	}
}
