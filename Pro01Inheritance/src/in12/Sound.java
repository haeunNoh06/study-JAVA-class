package in12;

/**
 * 인터페이스는 태생 자체가 추상 메서드만 작성하게끔 설계가 되어 있음
 */

public interface Sound {
	public void SoundUp(int level);// 추상메서드
	public void SoundDown(int level);
	
	// !!!오류 발생!!! --- 추상메서드가 아니기 때문 ({}가 바디가 있음)
//	public void SoundStop() {
//		System.out.println("중단");
//	}
}
