package test;

public class Employee extends Person{

	protected String company, jicgup, buseo;
	
	public Employee(String name, int age) {
		super(name, age);
	}

	public String toString() {
		return "=====직원정보=====\n"
				+ "이름 : "+super.name+"\n"
				+ "나이 : "+super.age+"세\n"
				+ "군번 : "+this.company+"\n"
				+ "사단 : "+this.jicgup+"\n"
				+ "중대 : "+this.buseo+"\n"
				+ "===============\n\n";
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setJicgup(String jicgup) {
		this.jicgup = jicgup;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

}
