package in01;

public class Point {
	
	private int x, y; // 한 점을 구성하는 x, y 좌표
	
	public void set(int x, int y) { // x,y는 스택 영역에 저장되고
		// 메서드 실행이 종료되면 x, y 변수는 사라진다.
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}

}
