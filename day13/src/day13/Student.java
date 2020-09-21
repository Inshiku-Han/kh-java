package day13;

public class Student {
	private String name;
	private int age;
	private String grade;
	
public Student() {}

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

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}
public void setStudentInfo(String name, int age, String grade) {
	setName(name);
	setAge(age);
	setGrade(grade);
	
}
public void displayStudentInfo() {
	System.out.println("이름 = " + getName());
	System.out.println("나이 = " + getAge());
	System.out.println("성적 = " + getGrade());
}
}


