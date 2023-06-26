package in05;

public class DowncastingEx {
	public static void main(String[] args) {
		Person p = new Student("이재문"); // Upcasting 발생
		Person p1 = new Person(); // p1객체 생성(Upcasting 발생 안됨)
		
		Student s, s1;
		
		// Student s2 = new Researcher();---형제관계는 Upcasting할수가 없다.
		
		s = (Student)p; // Upcasting된 p는 Downcasting할수 있다.
		// s1 = (Student)p1;--- 실행시 오류발생
		System.out.println(s.name);
		s.grade="A";
		// System.out.println(s1.name);---오류발생
		// s1.grade="A";---오류발생
	}
}
