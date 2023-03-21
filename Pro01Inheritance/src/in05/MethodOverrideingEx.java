package in05;

public class MethodOverrideingEx {

	public static void main(String[] args) {
		Line line = new Line();
		// paint(Shape p) 메서드를 호출하는데 Shape p = line 문장과 같다.
		// 즉 아래의 문장에서 "업캐스팅"이 발생됨.
		
		// p는 Shape 클래스를 가리키는 객체변수인데 line객체를 할당받아서 업캐스팅
		Shape p = line;
		p.a = 234;
		p.b = 234.567;
		p.shapedraw();
		p.draw();
		// p는 shape클래스의 모든 멤버에 접근할 수 있는데, 오버라이딩(재정의)된 메서드는
		// 하위 클래스의 메서드를 호출한다.
		
	}

}
