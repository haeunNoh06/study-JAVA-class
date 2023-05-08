package pack05;

/**
 * 주사위의 눈의 수(1~6)은 이것이다. 10번 던져서
 * 
 * 1의 눈 : 500원
 * 2의 눈: 1000원
 * 3의 눈: 1500원
 * 4의 눈: 2000원
 * 5의 눈 : 2500원
 * 6의 눈: 3000원
 * 전체 금액은 얼마인가?
 *
 */

public class RandomEx {

	public static void main(String[] args) {
		System.out.println("주사위의 눈은 ");
		
		int sum = 0;
		for ( int i = 1; i <= 6; i++) {
			int num = (int)(Math.random()*6+1);
			System.out.println(i+"번째 주사위 : "+num);
			sum += i*500;
		}
		System.out.println("SUM : "+sum);
	}

}
