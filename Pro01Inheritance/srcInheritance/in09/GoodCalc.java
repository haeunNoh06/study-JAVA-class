package in09;

public class GoodCalc extends Calculator{

	// 추상클래스에서 상속받은 추상메서드는
	// GoodCalc 클래스에서 반드시 구현해야 한다
	// 구현하지 않으면 컴파일에러
	@Override	// 어노테이션
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {	// int[] a =  new int[] {2,3,4})와 같은 표현
		double sum = 0.0;
		for ( int i = 0;i < a.length; i++)
			sum += a[i];
		return sum/a.length;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
	
}
