package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetLotto {
public static void main(String[] args) {
	Random rand = new Random(); // 1 <= x <, 45
	//rand.nextInt(45) + 1; // 1 <= x < 46 ���� ����
	
	List<Integer> list = new ArrayList<Integer>();
	
	for(int i = 0 ; i < 6; i++) {
		int num = rand.nextInt(45) + 1;
		list.add(num);
	}
	Set<Integer> set = new HashSet<Integer>(list);
	list = new ArrayList<Integer>(set);
	for(int e : list) {
		System.out.print(e + " ");
	}
	// �� �ڵ�� �ߺ��߻��� �迭������ �پ������! SetLotto2 ����
	
	}
}

