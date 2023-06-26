package test;

public class Ex {

	public static void main(String[] args) {
		Student st = new Student("홍길동", 30);
		st.setBan(2);
		st.setGrade(2);
		st.setId(2209);
		st.setScore(100);
		System.out.println(st.toString());
		
		Soldier sd = new Soldier("동길동", 25);
		sd.setNum(12423232);
		sd.setSadan(3);
		sd.setJungdae(4);
		sd.setSodae(2);
		sd.setJonggua("조교");
		System.out.println(sd.toString());
		
		Employee ep = new Employee("카카오", 25);
		ep.setCompany("풀스택 개발");
		ep.setJicgup("김길동");
		ep.setBuseo("전무");
		System.out.println(ep.toString());
	}

}
