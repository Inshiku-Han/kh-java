package MultipleClass;

public class Worker {
	private PersonInfo p; // �̸� ���� �ּ� �� ���Ե� Ŭ���� ��������
	private WorkInfo w; // ȸ��� �μ��� �޿� �� ���Ե� Ŭ���� ��������
	
	public Worker() { // �����ڷ� �� Ŭ���� ��ü ����
		p = new PersonInfo();
		w = new WorkInfo();
	}
	
	public void setWorkerInfo(String name, int age, String address, String company, String dept, int salary) { // setter
		p.setPersonInfo(name, age, address); 
		w.setWorkInfo(company, dept, salary);
		
	}
	public void displayWorkerInfo() {
		p.displayPersonInfo();
		w.displayWorkInfo();
	}
	
	
	
}
