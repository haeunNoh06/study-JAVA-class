package coll04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String,Integer> javaScore = new HashMap<String,Integer>();
		
		// 5개의 점수 저장
		javaScore.put("노하은",17);
		javaScore.put("박화경",37);
		javaScore.put("박세연",47);
		javaScore.put("김현지",57);
		javaScore.put("김한솔",67);
		
		System.out.println("HashMap의 요소의 갯수는 : "+javaScore.size());
		
		// 모든 사람의 점수를 출력ㅅ
		// javaScore에 저장되어 있는 (key,value)를 출력하는데
		// key문자열을 가진 집합을 Set콜렉션 keys객체변수에 넘겨준다. 
		Set<String> keys = javaScore.keySet();
		
		// key값들을 순차적으로 접근할 수 있는 iterator객체변수를 생성
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+" :"+score);
		}
	}

}
