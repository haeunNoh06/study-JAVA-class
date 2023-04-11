package in03;

public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표

	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) { // x,y는 스택 영역에 저장되고
		// 메서드 실행이 종료되면 x, y 변수는 사라진다.
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
