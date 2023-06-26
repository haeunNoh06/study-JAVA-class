package th03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame {

	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 컨테이너 창을 닫을 때 응용 프로그램이 종료된다.
		Container c = getContentPane();
		// 컨테이너가 생성
		// Container c = new Container(); --> 잘못된 예제
		c.setLayout(new FlowLayout());
		// 컨테이너에 오브젝를 어떻게 배치할 것인가?
		
		// 깜빡이는 레이블 생성
		FlickeringLabel flabel = new FlickeringLabel("깜빡", 500);
		// FlickeringLabel클래스 객체 생성시 생성자 호출
		
		// 깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("안깜빡");
		
		// 깜빡이는 레이블 생성
		FlickeringLabel flabel2 = new FlickeringLabel("여기도 깜빡", 300);
		
		
		c.add(flabel);// c컨테이너에 fLabel1라는 객체를 배치
		c.add(label);// c컨테이너에 label이라는 객체를 배치
		c.add(flabel2);// c컨테이너에 flabel2라는 객체를 배치
		
		setSize(300,150);// 컨테이너의 사이즈
		setVisible(true);// 컨테이너를 화면에 출력(true)
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
		// 익명의 객체가 생성되고 생성자 호출
	}

}
