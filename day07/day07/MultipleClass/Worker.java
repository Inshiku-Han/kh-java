package MultipleClass;

public class Worker {
	private PersonInfo p; // 이름 나이 주소 가 포함된 클래스 가져오기
	private WorkInfo w; // 회사명 부서명 급여 가 포함된 클래스 가져오기
	
	public Worker() { // 생성자로 각 클래스 객체 생성
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
