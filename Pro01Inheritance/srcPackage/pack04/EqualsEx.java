package pack04;
public class EqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		
		if(a.equals(b))
			System.out.println("a is equals to b");
		if(a.equals(c))
			System.out.println("a is equals to c");
		if(b.equals(c))
			System.out.println("b is equals to c");
	}
}
