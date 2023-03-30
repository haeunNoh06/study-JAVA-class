package in12;

public class SoundExam {

	public static void main(String[] args) {
		
		// 인터페이스는 객체 생성을 할 수 없다
//		Sound tv = new Sound();
		
		
		
		Sound tv = new TV(); // 부모인 Sound에 자식인 TV를 할당했기 때문에 "업캐스팅"된 것
		
		Sound radio = new Radio(); 
		
		// tv 객체변수는 TV 클래스에 있는 재정의된 SoundUp() 메서드를 호출
		tv.SoundUp(5);
		tv.SoundDown(10);
		
		// radio객체변수는 Radio클래스에 있는 재정의된 SoundUp() 메서드를 호출
		radio.SoundDown(10);
		radio.SoundDown(5);
	}

}
