package in01;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		// Point클래스를 가리키는 객체변수 p에의 객체 생성
		//그 객체는 p이름으로 접근한다.
		p.set(1, 2);
		// Point클래스 안에 있는 set()메소드를 호출
		p.showPoint();
		// Point클래스 안에 있는 showPoint()메소드를 호출
		
		ColorPoint cp = new ColorPoint();
		// ColorPoint클래스를 가리키는 객체 생성. 
		// cp라는 이름으로 접근하고, Point클래스를 상속 받았기 때문에
		// Point클래스의 멤버 접근 가능하다.
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		// cp.x=100; x가 private이기 때문에 접근불가
	}
}