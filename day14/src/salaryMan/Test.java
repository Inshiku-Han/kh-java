package salaryMan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ȸ����� ������ �����ϴ� Ŭ������ �ϳ� ������. �� Ŭ������ ���(String),�̸�, ����, �μ�, �޿������� ������.
//�μ��� ������, �λ��, ���ߺθ� ����.�ش� Ŭ������ ��ü�� ���� �� �ִ� ����Ʈ�� ����� ������ �����ͷ� 6���� ����Ʈ�� ��´�.
//1)��� ȸ����� ������ ����ϼ���. 2)��ü ����� �ѱ޿� ���� ����ϼ���. 3)���ߺθ� ������ ��� ����� ������ �޿� ����� ����ϼ���.
//4)�� �μ��� �μ���� �ѱ޿��� ����ϼ���.
public class Test {
	public static void main(String[] args) {
		List<BusinessMan> list = new ArrayList<BusinessMan>();

		list.add(new BusinessMan("1", "�ϳ�", 10, "������", 1000));
		list.add(new BusinessMan("2", "�ο�", 20, "�λ��", 2000));
		list.add(new BusinessMan("3", "����", 30, "���ߺ�", 3000));
		list.add(new BusinessMan("4", "�׿�", 40, "������", 4000));
		list.add(new BusinessMan("5", "�ټ�", 50, "�λ��", 5000));
		list.add(new BusinessMan("6", "����", 60, "���ߺ�", 6000));

		System.out.println("��� ȸ����� ����");
		Iterator<BusinessMan> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println();

		System.out.println("��ü ����� �ѱ޿� ��");
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getSalary();
		}
		System.out.println(sum);

		System.out.println();

		System.out.println("���ߺθ� ������ ��� ����� ����");
		int sum1 = 0;
		int sum2 = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if (!list.get(i).getDepart().equals("���ߺ�")) {
				System.out.println(list.get(i));
				sum1 += list.get(i).getSalary();
				sum2++;
			}
		}
		avg = (double) (sum1 / sum2);
		System.out.println("��! �޿� ���! : " + avg);
		
	}
}