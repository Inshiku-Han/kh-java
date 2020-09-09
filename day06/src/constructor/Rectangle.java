package constructor;

//	int 타입의 x1, y1, x2, y2 필드 : 사각형을 구성하는 두 점의 좌표
//	생성자 2개 : 디폴트 생성자와 x1, y1, x2, y2의 값을 설정하는 생성자
//	void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
//	int square() : 사각형 넓이 리턴
//	void show() : 좌표의 넓이 등 직사각형 정보의 화면 출력
//	boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 넓이면 true 리턴
public class Rectangle {
	int x1;
	int y1;
	int x2;
	int y2;

	public Rectangle() { // 디폴트 생성자
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}

	public Rectangle(int x1, int y1, int x2, int y2) { // 매개변수 생성자
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void set(int x1, int y1, int x2, int y2) { // setter
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int square() { // 넓이 리턴
		return (this.x2 - this.x1) * (this.y2 - this.y1);
	}

	public void show() { // 출력
		System.out.println("좌표 : (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
		System.out.println("넓이 : " + square());
	}

	// 인자로 전달된 객체 r과 현 객체가 동일한 넓이라면 true 리턴
	// 인자 : 매개변수에 들어오는 값
	public boolean equals(Rectangle r) {

		if (square() == r.square()) {
			return true;

		} else {
			return false;
		}
	}
}
