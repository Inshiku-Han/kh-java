package fieldClass;

public class Tv { //이것은 설계도. 실행시킨다는 개념이 아니다.(메인메소드가 없으면 실행이 안됨). 즉 메인메소드-실행 기능
	// 속성 - 변수
	String color; // 색상. 객체를 다루기 위한 참조변수 선언
	int channel; // 채널. 객체를 다루기 위한 참조변수 선언
	boolean power; // 전원여부 true -> on / false -> off
	// 기능 - 메소드
	// 전원 on/off
	public void onOff() { //static은 static메소드에 들어갈 때 사용
		power = !power;  // 토글 기능
	}
	// 채널 높이기
	public void channelUp() {
		channel = channel + 1;
	}
	// 채널 낮추기
	public void channelDown() {
		channel = channel - 1;
	}
	
	//현재 클래스 안에 있는 변수3개, 메소드3개을 멤버라 부른다. 멤버변수는 필드라 부른다.ㄴ
	//메소드 안에 있는 변수는 멤버나 필드라 부르지 않는다.(지역변수)
	//멤버변수는 자동 초기화
}
