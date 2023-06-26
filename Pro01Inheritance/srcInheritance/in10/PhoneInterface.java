package in10;

interface PhoneInterface {
	int TIMEOUT = 10000;	// 상수(일반적인 변수는 무조건 상수. public static final이 생략이 돼도 무조건 상수)
	void sendCall();	// abstract를 안 붙여도 추상메서드로 인식함(바디{} 없음)(abstract가 생략됨--추상메서드)
	void receiveCall();	// 추상메서드(abstract 키워드 생략됨)(abstract가 생략됨--추상메서드)
	// 인터페이스에서도 기본메서드를 만들 수 있게 하자 (default)
	default void printLogo() {
		System.out.println("** phone **");
	}
}
