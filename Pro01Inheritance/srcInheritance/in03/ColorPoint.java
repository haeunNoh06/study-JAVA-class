package in03;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// x=5, y=6, color="blue"
		super(x, y); //x=5, y=6
		// 상위 클래스의 생성자 중에서
		// 2개의 정수형 매개변수
		// 를 갖는 생성자 호출
		// 이 문장은 반드시 첫번째 줄에 와야 한다.
		// super(); 이 문장은 생성자 메소드안에서
		// 1개만 와야 한다.
		this.color=color;
	}

	public void setColor(String color) { // 점의 색을 저장
		this.color = color; // color에 "red" 저장 
	}
	
	public void showColorPoint() { // 컬럼 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 메소드를 호출
	}
}

