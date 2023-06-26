package file02;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Temp\\test.out");
			for ( int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch (Exception e) {
			System.out.println("C:\\Temp\\test.out에 저장할 수 없습니다."+"경로명을 확인해주세요.");
		}
		System.out.println("C:\\Temp\\test.out에 저장했습니다.");
		// test.out파일에 있는 내용을 메모장에 불러오게 되면 데이터가 깨어진 것 처럼 보인다.
		// 왜냐하면 텍스트 파일이 아니기 때문
	}

}
