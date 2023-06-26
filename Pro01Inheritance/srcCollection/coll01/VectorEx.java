package coll01;

import java.util.Vector;

public class VectorEx {

	public static void printVector(Vector<Integer> v2) {
		// Vector<Integer> v2 = v와 같다.
		for ( int i = 0; i < v2.size(); i++) {
			int n = v2.get(i);
			System.out.println(n+" ");
		}
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		// v는 벡터클래스의 객체변수로 데이터는 정수를 담는 것으로 
		// Vector()생성자에 의해서 10개의 기억공간이 만들어진다.

		v.add(5);// 5 삽입
		v.add(4);// 인덱스 1번째 4가 삽입
		v.add(-1);// 인덱스 2번째 -1가 삽입
		
		v.add(2,100);
		// 인덱스 두번째에 100을 삽입하고
//		인덱스 2번째 이후의 데이터는 뒤로 한 칸씩 이동된다.
		// 0번째 5, 1번째 4, 2번째 100, 3번째 -1
		
		System.out.println("벡터내의 요소 객체 수 : "+v.size());
		// 실제 데이터가 저장되어 있는 데이터 갯수
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		// 전체용량
		
		printVector(v);// 메소드 호출되는데 파라미터값은 v객체인데
		// v가 전달이 되는데 ....받는 쪽도 같은 자료형이어야 한다.
		
//		for ( int i = 0; i < v.size(); i++) {
//			System.out.println(v.get(i));
//		}
		int sum = 0;
		for ( int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		System.out.println("벡터에 있는 모든 정수의 합 : "+sum);
	}

}
