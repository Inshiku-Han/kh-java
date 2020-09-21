package salaryMan;

public class BusinessMan {
	private String number;
	private String name;
	private int age;
	private String depart;
	private int salary;
	public BusinessMan() {
	}
	public BusinessMan(String number, String name, int age, String depart, int salary) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.depart = depart;
		this.salary = salary;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "사번 : " + number + ", 이름 : " + name + ", 나이 : " + age + ", 부서 : " + depart + ", 급여 : "
				+ salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
