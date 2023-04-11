package in03;

public class ColorPoint extends Point {
	private String color; // 점의 색

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color; // 멤버변수에 color 값을 저장
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
