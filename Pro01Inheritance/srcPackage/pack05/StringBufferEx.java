package pack05;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");	// sb의 문자열 뒤에 붙이기
		System.out.println(sb);	// sb = "This is pencil"
		
		sb.insert(7, " my");	// sb의 7번째 방에 " my" 삽입하기
		System.out.println(sb);	// sb = "This is my pencil"
		
		sb.replace(8, 10, "your");	// sb의 8~10번째 방의 문자열을 "your"로 바꾸기
		System.out.println(sb);	// sb = "This is your pencil"
			
		sb.delete(8, 13);	// sb의 8~13번째 방의 문자열을 삭제하기
		System.out.println(sb);	// sb = "This is pencil"
		
		sb.setLength(4);	// sb의 문자열길이를 4로 정하고 뒷부분은 삭제된다.
		System.out.println(sb);	// sb = "This"
		
		
	}

}
