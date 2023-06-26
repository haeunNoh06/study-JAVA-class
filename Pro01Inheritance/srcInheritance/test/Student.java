package test;

public class Student extends Person{
	
	protected int grade, ban, id, score;
	
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public String toString() {
		return "Student [name="+this.name+", age="+this.age+"]";
	}
}
