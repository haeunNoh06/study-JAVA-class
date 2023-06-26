package th01;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
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
