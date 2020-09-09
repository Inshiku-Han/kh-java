package salaryManSolution;

import java.util.ArrayList;
import java.util.List;

public class WorkerTest {
public static void main(String[] args) {
	List<Worker> list = new ArrayList<Worker>();
	
	list.add(new Worker("100", "j", 10, "���ߺ�", 100));
	list.add(new Worker("101", "ja", 20, "���ߺ�", 150));
	list.add(new Worker("102", "jav", 30, "�λ��", 200));
	list.add(new Worker("103", "java", 40, "�λ��", 250));
	list.add(new Worker("104", "javav", 50, "������", 300));
	list.add(new Worker("105", "javava", 60, "������", 350));
	
	//��� ����� ���� ���
	for(Worker e : list) {
		System.out.println(e);
	}
	System.out.println();
	
	//��ü ����� �ѱ޿� ���� ����ϼ���.
	int salarySum = 0;
	for(int i = 0 ; i < list.size(); i++) {
		salarySum += list.get(i).getSalary();
	}
	System.out.println("�� �޿� �� = " + salarySum + "\n");
	
	//���ߺθ� ������ ��� ����� ������ �޿� ��� ���
	int empCnt = 0;
	int sum = 0;
	for(int i = 0 ; i < list.size(); i++) {
		if(!list.get(i).getDept().equals("���ߺ�")) {
			System.out.println(list.get(i));
			//���ߺθ� ������ ����� ��, ���ߺθ� ������ ����� �� �޿� ��
			empCnt++;
			sum += list.get(i).getSalary();
		}
	}
	System.out.println("���ߺθ� ������ ����� �޿� ��� = " + ((double)sum/empCnt) + "\n");
	
	//�� �μ��� �μ���� �ѱ޿�
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	for(int i = 0; i < list.size(); i++) {
		if(list.get(i).getDept().equals("���ߺ�")) { //���ߺ��̸� ...
			sum1 += list.get(i).getSalary();
		}else if(list.get(i).getDept().equals("������")){ // �������̸�
			sum2 += list.get(i).getSalary();
		}else { // �λ���̸�
			sum3 += list.get(i).getSalary();
		}
	}
	System.out.println("�������� �޿� �Ѿ� = " + sum1);
	System.out.println("���ߺ��� �޿� �Ѿ� = " + sum2);
	System.out.println("�λ���� �޿� �Ѿ� = " + sum3);
	
	
	
	
	
	
	
}
}
