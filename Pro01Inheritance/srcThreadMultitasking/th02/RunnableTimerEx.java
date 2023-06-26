package th02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame {

	public RunnableTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창을 닫으면 스레드가 종료됨
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);	// 컨테이너에 timeLabel 추가
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		// runnable이라는
		Thread th = new Thread(new TimerRunnable(timerLabel));
//		Thread th = Thread(runnable);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		// main method도 하나의 스레드이다.
		
		RunnableTimerEx te = new RunnableTimerEx();
		for ( int i = 0; i < 100; i++) {
			System.out.println("main_method");
		}
	}

}
