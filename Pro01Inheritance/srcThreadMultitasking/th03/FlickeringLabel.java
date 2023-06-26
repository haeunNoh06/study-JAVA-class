package th03;

import java.awt.Color;

import javax.swing.JLabel;

public class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		// 1. flabel1 객체 생성시 생성자 호출할 때 text="깜빡", delay=500이 넘어옴 
		super(text);
		// 지정된 텍스트("깜빡")로 레이블 인스턴스를 만든다. 레이블 생성
		this.delay = delay;
		setOpaque(true);// 배경색을 설정(true)
		Thread th = new Thread(this);// this : flabel1을 나타냄
		// 스레드 객체가 생성
		th.start();
		// 스레드 실행(run() 메서드 동작)
	}
	
	public void run() {
		int n = 0;
		while(true) {
			if ( n%2 == 0 ) {
				this.setBackground(Color.yellow);
				// fLabel1객체의 백그라운드를 노란색으로 지정
			} else {
				this.setBackground(Color.GREEN);
			}
			if ( n == 0 ) n = 1;
			else n = 0;
			try {
				Thread.sleep(delay);// delay=500 : 0.5초를 지연시켜라
			} catch (Exception e) {
				return;
			}
		}
	}

}
