package coll02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// 문자열 데이터 담는 ArrayLIst객체변수 a를 만들고 생성자도 호출
		// 기억공간이 10개 만들어짐
		ArrayList<String> a = new ArrayList<>();
		
		// 키보드로부터 4개의 이름을 입력받아서
		Scanner scan = new Scanner(System.in);
		for ( int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String s = scan.next();
			a.add(s);
		}
		
		for ( int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		// 이름이 가장 긴 것을 출력하라
		int longestIndex = 0;
		for ( int i = 1; i < a.size(); i++) {
			if ( a.get(longestIndex).length() < a.get(i).length() ) {
				longestIndex = i;
			}
		}
		System.out.println(a.get(longestIndex));
	}

}
