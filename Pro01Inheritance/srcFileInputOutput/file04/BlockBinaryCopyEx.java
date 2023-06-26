package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {

		File src = new File("./srcFileInputOutput/file03/forest.jpg");
		File dest = new File("./srcFileInputOutput/file03/copyforest3.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];// 1024가 1KB --> 10KB 버퍼 (임시기억공간)
			while(true) {
				int n = fi.read(buf);	// fi가 가리키는 파일에서 데이터를 읽어서
				// 그 길이값을 n에 저장하고, 그 길이값을 n에 넘겨준다. ( n : 읽은 길이 )
				
				// !!!!!!!!!!!!!!!!!!!!!아래꺼 시험문제 나올수도!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				// 예제 8-11번
				fo.write(buf, 0, n);	// buffer임시기억공간에 있는 데이터를 0번째인덱스부터 
				// 시작하여 n길이만큼의 데이터를 fo가 가리키는 파일(copy3forest.jpg)에 출력
				
				if ( n < buf.length)	// 반복해서 10240byte를 읽어서 n에 저장되어 있기 떄문에
					// false가 되었는데 마지막에 읽은 데이터는 9129를 n에 저장되었기 때문에
					// true가 발생한다. 따라서 while문이 종료된다.
					break;
			}
			fo.close();
			fi.close();
		} catch (Exception e) {
			System.out.println("출력오류");
		}
	}

}
