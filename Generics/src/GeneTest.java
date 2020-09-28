import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneTest {
	public static void main(String[] args) {
		//����Ʈ�� ����
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "java"));
		list.add(new Student(3, "c++"));
		list.add(new Student(2, "python"));
		
		//���Ĺ���� ���� ���������
		Collections.sort(list);
		
		
	}
}

//�������̽� Comparable : ���Ĺ�� �߰�
class Student implements Comparable<Student>{
	private int num;
	private String name;
	
	
	
	
	public Student() {
		super();
	}
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int compareTo(Student o) {
		
		
		return this.num - o.num;
	}
	
	
}