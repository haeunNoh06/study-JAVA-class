package in07;

public class MethodOverridingEx {
	static void paint(Shape p) { // Shape p = new Circle()
		p.draw();
	}

	public static void main(String[] args) {
		Line line = new Line(); // line 객체생성
		paint(line);// Shape p = line 와 같다. p.draw()는 Line클래스에 있는 draw()호출
		paint(new Shape());// Shape p = new Shape()와 같다. p.draw()는 Shape클래스에 있는 draw()호출
		paint(new Line()); // Shape p = new Line()와 같다. p.draw()는 Line클래스에 있는 draw()호출
		paint(new Rect()); // Shape p = new Rect()와 같다. p.draw()는 Rect클래스에 있는 draw()호출
		paint(new Circle());// Shape p = new Circle()와 같다. p.draw()는 Circle클래스에 있는 draw()호출

	}

}
