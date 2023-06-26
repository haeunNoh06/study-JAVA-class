package th02;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	// Runnable 인터페이스를 가지고 클래스를 구현하는데 run()메서드는
	// 반드시 재정의를 해야 한다.
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() { // 동작하는 스레드 메서드
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n)); // 레이블에 숫자를 출력한다.
			n++;
			try {
				Thread.sleep(1000);	// 1000 : 1초, 한 번 실행하고 1초 쉬었다가 다시 출력
				if ( n == 10 ) break;	// 0~9까지 출력됨
			} catch (Exception e) {
				return;
			}
		}
	}
}
