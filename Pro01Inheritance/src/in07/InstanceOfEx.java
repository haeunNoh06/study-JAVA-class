package in07;

public class InstanceOfEx {

	static void print(Person p) {
		if ( p instanceof Person ) {// Person p = new Student() 와 같은 표현 (업캐스팅 됨)
			System.out.print("Person ");
		}
		if ( p instanceof Student ) {
			System.out.print("Student ");
		}
		if ( p instanceof Researcher ) {
			System.out.print("Researcher ");
		}
		if ( p instanceof Professor ) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		System.out.print("new Student() ->   ");
//		print(new Student());
//		System.out.print("new Researcher() ->   ");
//		print(new Researcher());

		System.out.print("new Professor ->   ");
		print(new Professor());
	}

}
