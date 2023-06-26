package file01;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		// fout 출력파일 객체 변수 선언
		int c;
		
		try {
			fout = new FileWriter("C:\\Temp\\test.txt");
			// fout은 "test.txt"파일을 가리키는 파일 객체변수
			while(true) {	// 무한반복
				String line = sc.nextLine();	// 줄 단위로 데이터를 입력
				if (line.length() == 0) 
					break;// 입력하지 않고 Enter키를 누르면 while문을 빠져나옴
				fout.write(line,0,line.length());
				// line의 0번째 데이터부터 입력된 데이터의 길이 만큼을
				// fout이 가리키는 "test.txt"파일에 출력한다.
				fout.write("\r\n", 0, 2);	// 한 줄 띄우기 위해 "\r\n"을 저장하는 것
				// "\r\n"는 줄을 바꾸고 커서를 맨 앞으로 이동
			}
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
