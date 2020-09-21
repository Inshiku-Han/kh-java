package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//������ �й��� �л��̸��� ���� key�� value�� ������ �����͸� ������
//������ ������ map�� 5���� �����͸� �����Ѵ�.
//�ش� ���� �޼ҵ��� �Ű������� �����Ͽ�
//value�� ���� list���·� �����ϴ� �޼ҵ带 ���弼��.
public class Exam07 {
	public static void main(String[] args) {
		Exam08 a = new Exam08();
		Map<Integer, String> b = new HashMap<Integer, String>();

		b.put(1, "��");
		b.put(2, "��");
		b.put(3, "��");
		b.put(4, "��");
		b.put(5, "��");
		List<String> c = a.aaa(b);
		for (String e : c) {
			System.out.println(e);
		}
	}
}

class Exam08 {
	public List<String> aaa(Map<Integer, String> map) {
		// value���� ���� list ����
		List<String> list = new ArrayList<String>();

		// �Ű������� ���� map�� Ű���� setŸ������ ����
		Set<Integer> keys = map.keySet(); // keyset() : map�� �ִ� key�� ȣ��
		for (int e : keys) {
			String value = map.get(e);
			list.add(value);
		}
		return list;
	}
}