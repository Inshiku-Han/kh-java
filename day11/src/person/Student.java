package person;

public class Student extends Person{
	private int score;
	
	public void setInfo(String name, int age, int score) {
		setInfo(name, age); //�Ű������� ����
		this.score = score;
	}
		public void getInfo() {
			super.getInfo(); // super.���� ����
			System.out.println("���� = " + score);
		}
	
}
