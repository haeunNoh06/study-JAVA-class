package file01;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		// fin은 RileReader클래스를 가리키는 객체변수로 할당된 메모리는 없음
		// FileReader fin = new FileReader("C:\\Windows.system.ini");
		
		try {
			// 파일 입출력에 관계되는 모든 프로그램은 try ~ catch문을 사용해야 한다.
			// try ~ catch 안에 있는 프로그램을 실행하다가 오류가 발생하면 catch문장을 실행한다.
			// 만약에 오류가 없다면 catch문장은 실행 안 함
			
			fin = new FileReader("c:\\Windows\\system.ini");
			int c;
			
			// fin이 가리키는 파일에서 한 문자씩
			// 읽어서 c에 저장하고, fin객체변수가 파일의 끝에 도달하면 -1의 값ㅇ르
			// c에게 넘겨준다.
			// -1은 파일의 끝을 의미한다.
			// 그래서 true를 반환하면 파일의 끝까지 읽어서 화면에 출력한다.
			while ( (c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println("입출력 오류");
		}
	}

}
