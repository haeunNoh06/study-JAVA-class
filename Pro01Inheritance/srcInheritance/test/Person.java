package test;

public class Person {
	
	protected int age;
	protected String name;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person [name="+this.name+", age="+this.age+"]";
	}
}
