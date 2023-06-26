package in02;

public class Student extends Person {
	public void set() {
		age=30;
		name="홍길동";
		height=175;
		//weight=99;---weight는 private설정
		setWeight(99);
	}

}
