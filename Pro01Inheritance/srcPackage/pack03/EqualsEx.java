package pack03;

public class EqualsEx {
	public static void main(String[] args) {
		Point a = new Point(2,3); // 각각의 a,b,c객체 생성
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a==b) // a와 b가 가리키는 객체의 주소가 다름
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}
}
