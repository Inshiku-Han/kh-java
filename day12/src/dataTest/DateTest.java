package dataTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		// Date, Calendar, java.time

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR); // �⵵�� �޾� ��
		System.out.println(year);
		int month = cal.get(Calendar.MONTH) + 1; // �� �����͸� �޾� ��. 0���� ����
		System.out.println(month);
		int date = cal.get(Calendar.DATE); // �� �����͸� �޾� ��.
		System.out.println(date);

		// ��¥ ����
		cal.set(year, month, date);

		// ��¥ ���� ����
		// 2020-07-08, 20200708, 2020.07.08
		Date today = new Date(); // ���ͳݿ��� ��ũ���ؼ� ���
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String result = df.format(today);
		System.out.println(result);
	}
}
