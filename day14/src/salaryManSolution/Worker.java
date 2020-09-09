package salaryManSolution;

public class Worker {
	private String empNo;
	private String name;
	private int age;
	private String dept;
	private int salary;

	public Worker() {}

	public Worker(String empNo, String name, int age, String dept, int salary) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [empNo=" + empNo + ", name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
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

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
