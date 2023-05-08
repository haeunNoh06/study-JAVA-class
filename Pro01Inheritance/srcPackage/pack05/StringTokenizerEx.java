package pack05;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		// 구분자는 "/"로 설정하였고 토큰들은 "홍길동","장화","홍련","콩쥐","팥쥐"
		// st는 첫 번째 토큰을 가리킨다.
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		
		// st가 가리키는 곳에 토큰이 존재하면 true를 반환
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
			// st.nexToken : st가 가리키는 곳의 토큰을 출력한 후에 st는 다음 토큰으로 이동한다.
		}
	}

}
