package pack05;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+" 길이는 "+a.length());
		System.out.println(a.contains("#")); // a문자열에 #이 포함되어 있다면 true값을 반환
		
		a = a.concat(b);// 문자열 연결
		System.out.println(a);
		
		a = a.trim();// 공백 제거
		// 문자열의 맨 앞 부분과 뒷 부분의 공백을 제거(가운데 공백은 제거 못 함)
		System.out.println(a);
		
		a = a.replace("C#", "Java");// a 문자열의 C#을 Java로 문자열 교체
		System.out.println(a);
		
		String s[] = a.split(",");// 문자열 분리 (기준 ,)
		for ( int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열"+i+" : "+s[i]);
		}
		
		a = a.substring(5);// a 문자열의 인덱스 5번쨰 이후문자열 출력
		System.out.println(a);
		
		char c = a.charAt(2);// 인덱스 2번째 문자 출력
		System.out.println(c);
		
	}

}
