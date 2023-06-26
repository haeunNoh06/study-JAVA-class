package coll02;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		// v객체 변수는 Point 타입의 데이터를 저장
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));		// 0번째 데이터 삽입
		// 데이터가 삽입이 되는데 Point()생성자 의해서
		// x, y값이 저장이 된다.
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
//		v.add(100,200); // : 에러 발생. 객체 상태로 
		
		v.remove(1);	// (-5,10)이 지워짐
		
		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
			// Point 클래스에 있는 toString()메소드가 호출
			// System.out.println(p.toString()); // toString()메소드가 호출
		}
		
		
	}

}
