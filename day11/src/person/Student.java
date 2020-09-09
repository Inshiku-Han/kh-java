package person;

public class Student extends Person{
	private int score;
	
	public void setInfo(String name, int age, int score) {
		setInfo(name, age); //매개변수로 구별
		this.score = score;
	}
		public void getInfo() {
			super.getInfo(); // super.으로 구별
			System.out.println("점수 = " + score);
		}
	
}
