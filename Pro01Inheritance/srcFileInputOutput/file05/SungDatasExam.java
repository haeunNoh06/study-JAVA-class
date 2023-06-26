package file05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SungDatasExam {
	
	public void readingData(String fname) throws IOException {
		// fname = "c:\\Temp\\writedtxt"파일을 가리키고
		try {
			FileReader fr = new FileReader(fname);
			// fr은 writed.txt파일을 가리키고
			BufferedReader br = new BufferedReader(fr);
			// 버퍼 클래스를 이용해서 데이터를 읽는다. br은 "writed.txt"을 가리킴
			String csvStr = "";
			String tmpStr = "";
			do {
				tmpStr = br.readLine();
				// writed.txt파일에서 한 줄씩 읽어서 tmpStr에 넘겨준다
				if ( tmpStr != null ) {
					csvStr += (tmpStr + "\t"); // 파일에 있는 데이터를 한 줄씩 읽어서
					// csvStr에 저장하는데 한줄 끝에 "\t"
					System.out.println(csvStr);
				}
			} while(tmpStr != null );
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			// parse는 csvStr의 문자열에서 탭(\t)을 구분자로 하여 새로운 객체 생성
			int length = parse.countTokens() / 4;
			// parse.countTokens()는 parse가 가리키는 토큰의 갯수(16)
			// 따라서 lengths는 4가 된다.
			
			// 각각의 기억공간 4개 생성
			String[] name = new String[10];
			String[] address = new String[10];
			double[] math = new double[10];
			double[] english = new double[10];
			double[] total = new double[10];
			double[] avg = new double[10];
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken();	// 첫 번째 실행할 때 "kim"을 name[0]에 저장한 후에 
				// parse는 그 다음 토큰을 가리킨다.
				address[i] = parse.nextToken();	// address[0]에 "관악구" 저장한 후에 
				// parse는 그 다음 토큰을 가리킨다.
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				// parse.nexToken()은 "100"데이터를 실수형 객체타입의 데이터로 변환하고
				// .doubleValue()에 의해서 기본형 실수형식으로 변환하여 math[0]에 넘겨주고
				// parse는 그 다음 토큰을 가리킨다.
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				// parse.nexToken()은 "100"데이터를 실수형 객체타입의 데이터로 변환하고
				// .doubleValue()에 의해서 기본형 실수형식으로 변환하여 english[0]에 넘겨주고
				// parse는 그 다음 토큰을 가리킨다.
				total[i] = math[i] + english[i];	// 배열의 0번째 방의 데이터를 가지고 총점
				avg[i] = total[i] / 2.0;	// 배열의 0번째 방의 데이터를 가지고 평균
			}
			for ( int j = 0 ;j < length; j++) {
				System.out.println(name[j]+"\t"+address[j]+"\t"+math[j]+"\t"+english[j]+"\t"+total[j]+"\t"+avg[j]);
			}
			System.out.println("연산이 잘 이루어졌습니다.");
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}