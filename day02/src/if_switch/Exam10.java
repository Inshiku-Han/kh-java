package if_switch;

public class Exam10 {

	public static void main(String[] args) {
		int score = 96;
		String str = null;
		if (score >= 90) {
			if (score >= 95) {
				str = "A+"; // 95이상
			} else {
				str = "A-"; // 90이상 95미만
			}
		} else {
			str = "B";
		}
		System.out.println(str);

	}

}
