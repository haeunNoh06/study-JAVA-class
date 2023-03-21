package in04;

public class UpcastingEx {

	public static void main(String[] args) {

		Person p;
		Student s = new Student("이재문");
		p = s;// 업캐스팅
		// p는 person 클래스를 가리키는 객체변수이고
		// s는 하위클래스(Student)를 가리키는 객체로 
		// p는 s객체를 할당받음
		
		System.out.println(p.name);// 오류없음
		
//		p.grade = "A"; // 오류
//		p.department = "Com";	// 오류
		
	}
	

}
