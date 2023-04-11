package in08;

public class Circle extends Shape {
	
	protected String name;
	
	// 재정의 된 draw()를 실행함
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();
	}
}
