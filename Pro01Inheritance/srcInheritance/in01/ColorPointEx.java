package in01;

import java.awt.Color;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point(); // Point 객체 생성
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint sp = new ColorPoint();
		sp.set(3, 4);
		sp.setColor("하얀색");
		sp.showColorPoint();
	}

}
