package pack05;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));// 소문자 출력
		char c1='4', c2='F';
		if(Character.isDigit(c1)) //c1의 내용이 숫자인가?
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2))//c2의 내용이 문자인가?
			System.out.println(c2 + "는 영문자");
		System.out.println(Integer.parseInt("-123")); 
		//parseInt()메소드 안에는 정수(숫자) 형태의 문자열이 존재하고, 정수값으로 변환한다.
		System.out.println(Integer.toHexString(28));// 16진수 문자열로 출력
		System.out.println(Integer.toBinaryString(28)); //2진수 문자열로 출력
		System.out.println(Integer.bitCount(28)); // 28을 2진수로 바꾸어 1의 갯수
		
		Double d = Double.valueOf(3.14); // 기본형 데이터 3.14를 객체타입으로 변환
		System.out.println(d.toString()); // d의 값을 문자열로 출력
		System.out.println(Double.parseDouble("3.14")); 
		//parseInt()메소드 안에는 실수(숫자) 형태의 문자열이 존재하고, 실수값으로 변환한다.
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); // true를 문자열로 출력
		System.out.println(Boolean.parseBoolean("false")); //문자열 "false"를 false로 변환
	}
}
