package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//����Ʈ�� ���� �޼��带 ����ؼ� 10���� �����͸� �Է� 1 ~ 100���� ����
//����Ʈ�� ����� ��� �����͸� iterator�� �Ἥ ���
public class RandomIterator {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	
	for(int i = 0 ; i < 10 ; i ++) {
		list.add((int)(Math.random()*100)+1);
	}
	Iterator<Integer> ite = list.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
	
	
	
}
}
