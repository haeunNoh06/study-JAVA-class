package pack05;

public class MathEx {

	public static void main(String[] args) {
		
		double a = 34.567;
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a));	// 올림
		System.out.println(Math.floor(a));	// 내림
		System.out.println(Math.sqrt(9));	// 루트(제곱근)
		System.out.println(Math.exp(2));	// e(자연대수)
		System.out.println(Math.round(3.14));
		
		
		System.out.println("이번 주 행운의 번호는 ");
		for ( int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random()*45+1));
		}
	}

}
