package coll04;

public class GenericMethodExample {
	// <T>는 특정 메서드에 제네릭을 적용하겠다는 표시다
	// GStack<T>는 reverse메서드의 리턴타입
	// GStack<T> a에서 a는 GStack클래스의 매개변수
	public static <T> GStack<T> reverse(GStack<T> a) {	// a = gs
		GStack<T> s = new GStack<>();
		// s는 GStack클래스 객체변수 생성
		while (true) {
			T tmp;
			tmp = a.pop();	// 객체변수 a에 있는 데이터를 읽어서 tmp에 저장
			if ( tmp == null)
				break;
			else
				s.push(tmp);	// tmp에 저장되어 있는 데이터를 새로운 s객체에 데이터를 저장
		}
		return s;
	}
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for ( int i = 0;i < 5; i++) {
			gs.push(Double.valueOf(i));	// 0.0, 1.0, 2.0, 3.0, 4.0 순으로 데이터가 저장
			// Double.valueOf(i)은 정수 i값을 실수형으로 변환하는 것
		}
		// gs는 reverse메서드의 s객체의 리턴값을 받음
		gs = reverse(gs);
		for ( int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}
	}

}
