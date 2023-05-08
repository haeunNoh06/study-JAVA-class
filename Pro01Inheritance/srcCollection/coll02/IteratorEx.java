package coll02;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int n = it.next();	// 5를 n에게 넘겨주고 난 후에 it는 그 다음 데이터를 가리키게 된다.
			sum += n;
			System.out.println(n);
		}
		System.out.println("벡터 데이터 합 : "+sum);
	}
	
	

}
