package pack05;

public class AutoBosingUnboxingEx {

	public static void main(String[] args) {
		
		int n = 10;
		Integer intObject = n;
		System.out.println("intObject = "+intObject);
		
		int m = intObject + 10; // 객체변수 + 기본정수값 => 기본형으로 저장됨
		// 왼쪽에 있는 것이 기본형이라면 기본형으로, 객체형이면 객체로 저장됨
		System.out.println("m="+m);
	}

}
