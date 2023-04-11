package in11;

// MobilePhoneInterface, MP3Interface를 가지고 PDA가 구현함
// 그렇게 구현한 PDA를 SmartPhone이 상속받음
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받어");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요");
	}

	@Override
	public void play() {
		System.out.println("음악 연주합니다");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}

	// 일반 메서드 추가 작성
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
}
