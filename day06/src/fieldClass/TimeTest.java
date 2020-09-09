package fieldClass;

public class TimeTest {
public static void main(String[] args) {
	Time t = new Time(); // new 자동완성
	
	t.displayTime();
    t.hour = 100;
    t.displayTime();
    t.setHour(1000); // 메소드를 사용함으로서 오류를 방지가능
    t.displayTime();
	
}
}
