package in12;

public class SoundExam {

	public static void main(String[] args) {
		
		// 인터페이스는 객체 생성을 할 수 없다
//		Sound tv = new Sound();
		
		
		// tv는 Sound인터페이스를 카리키는 객체변수이지만 TV클래스를 할당
		Sound tv = new TV(); // 부모인 Sound에 자식인 TV를 할당했기 때문에 "업캐스팅"된 것
		
		// radio는 Sound인터페이스를 가리키는 객체변수이지만 Radio클래스를 할당
		Sound radio = new Radio(); 
		
		// tv 객체변수는 TV 클래스에 있는 재정의된 SoundUp() 메서드를 호출
		tv.SoundUp(5);
		tv.SoundDown(10);
		// radio객체변수는 Radio클래스에 있는 재정의된 SoundUp() 메서드를 호출
		radio.SoundUp(5);
		
		radio.SoundDown(15);
	}

}
