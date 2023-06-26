package pack03;

public class Point {
	private int x;// 2
	private int y;// 3
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		// Object obj = c와 같은 표현
		Point p = (Point)obj;// 다운 캐스팅
		if(this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}
}

