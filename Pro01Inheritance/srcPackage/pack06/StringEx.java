package pack06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C  ++ ");
		
		System.out.println(a + "길이는 " + a.length());
		System.out.println(a.contains("#")); 
		// a문자열에 '#'문자가 있으면 true를 반환
		
		a = a.concat(b); 
		// a와 b가 결합된 새로운 문자열을 생성한다.
		// 원래 a는 " C#"를 가리키는 객체변수인데  
		// a는 새로운 문자열 " C#,C++"을 가리킨다.
		System.out.println(a);
		
		a = a.trim(); // 양쪽(맨앞 또는 맨뒤) 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		// a = "Java,C  ++"		
		String s[] = a.split(","); // a문자열을 분리 하는데 기준이 ,이다
		for(int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ":" + s[i]);
		
		a = a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
	}
}