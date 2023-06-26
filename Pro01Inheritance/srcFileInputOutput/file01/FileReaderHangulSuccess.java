package file01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReaderHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			// fin객체변수는 "system.ini" 파일을 가리키는데 그 데이터 charset은 UTF-8로 설정되어 있다.
			in = new InputStreamReader(fin, "MS949");
//			in = new InputStreamReader(fin, "UTF-8");
			// inputStreamReader라는 클래스에서 fin을 가리키는 파일의 charset을 "MS949"인코딩형식으로 변환시킨 파일을 가리키는 in 객체변수 생성
			int c;
			
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();// 객체생성의 역순으로 파일을 가리키는 객체변수를 파일(을 닫는다)과 연결을 차단한다.
			fin.close();
		} catch (Exception e) {
			System.out.println("입출력 오류");
		}
	}

}
