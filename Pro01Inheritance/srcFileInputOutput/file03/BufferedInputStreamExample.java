package file03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("./srcFileInputOutput/file03/forest.jpg");
		// 상대경로인데 ./ 는 현재프로젝트이다.
		// 수행 : 파일 데이터를 만들어 읽어 파싱해서 변수에 저장해서 출력
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때 : "+(end-start)+"ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("./srcFileInputOutput/file03/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때 : "+(end-start)+"ms");
		bis.close();
		fis1.close();
	}

}
