package pack01;

// Object클래스는 모든 클래스의 아버지 클래스이다.
public class ObjectPropertyEx {
	public static void print(Object obj) { // Object obj = p 와 같은 문장(업캐스팅)
		System.out.println(obj.getClass().getName()); // 클래스 이름 출력
		System.out.println(obj.hashCode()); // Point클래스의 고유코드
		System.out.println(obj.toString()); // 패키지를 포함한 클래스이름과 해시코드(16진수)
		System.out.println(obj); // .toString()가 생략됨
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
