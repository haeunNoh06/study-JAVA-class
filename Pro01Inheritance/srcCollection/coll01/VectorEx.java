package coll01;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		v.add(5);	// 5 삽입
		v.add(4);
		v.add(-1);
		
		v.add(2,100);	// 인덱스 두번째에 100을 삽입하고 인덱스 2번째 이후의 데이터는 뒤로 한 칸씩 이동된다.
		
		System.out.println("벡터내의 요소 객체 수 : "+v.size());
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		
		
		for ( int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		int sum = 0;
		for ( int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		System.out.println("벡터에 있는 모든 정수의 합 : "+sum);
	}

}
