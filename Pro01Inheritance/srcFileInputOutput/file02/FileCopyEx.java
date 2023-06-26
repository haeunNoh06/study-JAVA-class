// C:\\Temp\\test.txt파일을 복사하는 testout.txt을 생성하는 프로그램을 작성하시오. 
package file02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyEx {

	public static void main(String[] args) {
//		File src = new File("C:\\Temp\\test.txt");
//		File dest = new File("C:\\Temp\\testout.txt");
		int c;
		try {
			FileReader fr = new FileReader("C:\\Temp\\test.txt");
			FileWriter fw = new FileWriter("C:\\Temp\\testout.txt");
			while((c=fr.read())!= -1) {	// fr은 "test.txt"에 있는 데이터를 한문자씩 읽음
				fw.write((char)c);	// fw가 가리키는 "testout.txt"파일에 출력한다.
			}
			fr.close();
			fw.close();
			System.out.println("복사가 잘 되었음");
//			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사");
		} catch (Exception e) {
			
		}
		
	}

}
