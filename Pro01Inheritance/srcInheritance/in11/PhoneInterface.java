package in11;

public interface PhoneInterface {
	int TIMEOUT = 10000; // public static final이 생략됨--상수
	void sendCall(); // abstract이 생략됨--추상메서드
	void receiveCall();	// abstract이 생략됨--추상메서드
	
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
