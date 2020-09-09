package dataTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		// Date, Calendar, java.time

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR); // 년도를 받아 옴
		System.out.println(year);
		int month = cal.get(Calendar.MONTH) + 1; // 월 데이터를 받아 옴. 0부터 시작
		System.out.println(month);
		int date = cal.get(Calendar.DATE); // 일 데이터를 받아 옴.
		System.out.println(date);

		// 날짜 세팅
		cal.set(year, month, date);

		// 날짜 포맷 지정
		// 2020-07-08, 20200708, 2020.07.08
		Date today = new Date(); // 인터넷에서 스크랩해서 써라
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String result = df.format(today);
		System.out.println(result);
	}
}
