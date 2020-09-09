package fieldClass;

public class Time {
	int hour; // 시
	int minute; // 분
	int second; // 초
	
	//시간을 세팅
	public void setHour(int h) {
		if(h < 0 || h > 23) {
			System.out.println("잘못된 값입니다. 시간이 변경되지 않았습니다.");
			return; // 실행종료
		}
		hour = h;
		
		
			
		
	}
	//분을 세팅
	public void setMinute(int m) {
		minute = m;
	}
	//초를 세팅
	public void setSecond(int s) {
		second = s;
		
	}
	//시간을 출력
	public void displayTime() {
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
