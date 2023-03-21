package in06;

public class DownCastingEx {

	public static void main(String[] args) {

		/* 시험문제!!!! 다음 중 업 캐스팅이 잘 못된 것은??  */
		/* 시험문제!!!! 다음 중 instaceof이 false가 나오는 것은?*/
		/* 시험문제!!!! 
		 * 
		 * if ( 3 instanceof int) 이것은 문법오류!!! instanceof는 객체에 대한 레퍼런스만 사용
		 * 
		 * if ( "java" instanceof String) 이것은 맞음!!!! string은 문자열로 "객체"이다.
		 * 
		 * */
		
		Person p = new Student("이재문"); // 업캐스팅
		// p는 Person 클래스를 가리키는 갤체변수이지만, Student객체를 할당받아
		// Upcasting이 발생함
		
		Student s;	
		// s는 Student 클래스를 가리키는 객체 변수로 선언만 한 상태(기억공간 할당은 받지 못함)
		
		s = (Student)p;	// 다운 캐스팅
		// s는 업캐스팅된 p객체변수를 가지고 Student 클래스로 다운캐스팅하면
		// Student 클래스의 객체를 할당받는 것과 같다.
		// 따라서 Student s = new Student() 이 문장과 같은 효과를 가진다.
		// 다운 캐스팅은 반드시 업캐스팅된 객체변수를 가지고 해야 한다.
		
		System.out.println(s.name);
		s.grade = "A";
		s.name = "B";
		System.out.println(s.grade);
		System.out.println(s.name);
	}

}
