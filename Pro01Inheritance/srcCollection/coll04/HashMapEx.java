/**
 * (영어,한글) 단어를 쌍으로 해시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하라.
 * "exit이 입력되면 프로그램을 종료하는 프로그램 작성
 */

package coll04;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<String,String>();
		
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는 ? >>");
			String eng = scan.next();
			if ( eng.equals("exit")) {
				System.out.println("종료됩니다.");
				break;
			}
			String kor = dic.get(eng);// 영어 또는 한글 가져오기
			if ( kor == null) {	// 만약 한글이면
				System.out.println(eng+" 는 없는 단어입니다.");
			} else {	// 만약 영어면
				System.out.println(kor);
			}
		}
	}

}
