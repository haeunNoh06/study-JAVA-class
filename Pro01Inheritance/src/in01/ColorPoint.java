package in01;

public class ColorPoint extends Point {
	private String color; // 점의 색

	public void setColor(String color) {
		this.color = color; // 멤버변수에 color 값을 저장
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
