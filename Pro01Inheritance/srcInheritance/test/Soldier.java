package test;

public class Soldier extends Person{

	protected int num, sadan, jungdae, sodae;
	protected String jonggua;
	
	public Soldier(String name, int age) {
		super(name, age);
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setSadan(int sadan) {
		this.sadan = sadan;
	}

	public void setJungdae(int jungdae) {
		this.jungdae = jungdae;
	}

	public void setSodae(int sodae) {
		this.sodae = sodae;
	}

	public void setJonggua(String jonggua) {
		this.jonggua = jonggua;
	}

	public String toString() {
		return "=====군인정보=====\n"
				+ "이름 : "+super.name+"\n"
				+ "나이 : "+super.age+"세\n"
				+ "군번 : "+this.num+"\n"
				+ "사단 : "+this.sadan+"사단\n"
				+ "중대 : "+this.jungdae+"중대\n"
				+ "소대 : "+this.sodae+"소대\n"
				+ "종과 : "+this.jonggua+"\n"
				+ "===============\n";
	}
	
}
