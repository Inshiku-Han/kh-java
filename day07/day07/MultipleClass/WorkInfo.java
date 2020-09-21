package MultipleClass;

public class WorkInfo {
	private String company;
	private String dept;
	private int salary;
	
	public WorkInfo() {
		
	}
	public void setWorkInfo(String company, String dept, int salary) {
		this.company = company;
		this.dept = dept;
		this.salary = salary;
	}
	public void displayWorkInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("부서명 : " + dept);
		System.out.println("급여 : " + salary);

	}
	
}
