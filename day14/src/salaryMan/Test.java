package salaryMan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//회사원의 정보를 저장하는 클래스를 하나 만들자. 이 클래스는 사번(String),이름, 나이, 부서, 급여정보를 가진다.
//부서는 영업부, 인사부, 개발부만 존재.해당 클래스의 객체를 담을 수 있는 리스트를 만들어 임의의 데이터로 6명을 리스트에 담는다.
//1)모든 회사원의 정보를 출력하세요. 2)전체 사원의 총급여 합을 출력하세요. 3)개발부를 제외한 모든 사원의 정보와 급여 평균을 출력하세요.
//4)각 부서별 부서명과 총급여를 출력하세요.
public class Test {
	public static void main(String[] args) {
		List<BusinessMan> list = new ArrayList<BusinessMan>();

		list.add(new BusinessMan("1", "하나", 10, "영업부", 1000));
		list.add(new BusinessMan("2", "두울", 20, "인사부", 2000));
		list.add(new BusinessMan("3", "세엣", 30, "개발부", 3000));
		list.add(new BusinessMan("4", "네엣", 40, "영업부", 4000));
		list.add(new BusinessMan("5", "다섯", 50, "인사부", 5000));
		list.add(new BusinessMan("6", "여섯", 60, "개발부", 6000));

		System.out.println("모든 회사원의 정보");
		Iterator<BusinessMan> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println();

		System.out.println("전체 사원의 총급여 합");
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getSalary();
		}
		System.out.println(sum);

		System.out.println();

		System.out.println("개발부를 제외한 모든 사원의 정보");
		int sum1 = 0;
		int sum2 = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if (!list.get(i).getDepart().equals("개발부")) {
				System.out.println(list.get(i));
				sum1 += list.get(i).getSalary();
				sum2++;
			}
		}
		avg = (double) (sum1 / sum2);
		System.out.println("와! 급여 평균! : " + avg);
		
	}
}