package salaryManSolution;

import java.util.ArrayList;
import java.util.List;

public class WorkerTest {
public static void main(String[] args) {
	List<Worker> list = new ArrayList<Worker>();
	
	list.add(new Worker("100", "j", 10, "개발부", 100));
	list.add(new Worker("101", "ja", 20, "개발부", 150));
	list.add(new Worker("102", "jav", 30, "인사부", 200));
	list.add(new Worker("103", "java", 40, "인사부", 250));
	list.add(new Worker("104", "javav", 50, "영업부", 300));
	list.add(new Worker("105", "javava", 60, "영업부", 350));
	
	//모든 사원의 정보 출력
	for(Worker e : list) {
		System.out.println(e);
	}
	System.out.println();
	
	//전체 사원의 총급여 합을 출력하세요.
	int salarySum = 0;
	for(int i = 0 ; i < list.size(); i++) {
		salarySum += list.get(i).getSalary();
	}
	System.out.println("총 급여 합 = " + salarySum + "\n");
	
	//개발부를 제외한 모든 사원을 정보와 급여 평균 출력
	int empCnt = 0;
	int sum = 0;
	for(int i = 0 ; i < list.size(); i++) {
		if(!list.get(i).getDept().equals("개발부")) {
			System.out.println(list.get(i));
			//개발부를 제외한 사원의 수, 개발부를 제외한 사원의 총 급여 합
			empCnt++;
			sum += list.get(i).getSalary();
		}
	}
	System.out.println("개발부를 제외한 사원의 급여 평균 = " + ((double)sum/empCnt) + "\n");
	
	//각 부서별 부서명과 총급여
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	for(int i = 0; i < list.size(); i++) {
		if(list.get(i).getDept().equals("개발부")) { //개발부이면 ...
			sum1 += list.get(i).getSalary();
		}else if(list.get(i).getDept().equals("영업부")){ // 영업부이면
			sum2 += list.get(i).getSalary();
		}else { // 인사부이면
			sum3 += list.get(i).getSalary();
		}
	}
	System.out.println("영업부의 급여 총액 = " + sum1);
	System.out.println("개발부의 급여 총액 = " + sum2);
	System.out.println("인사부의 급여 총액 = " + sum3);
	
	
	
	
	
	
	
}
}
