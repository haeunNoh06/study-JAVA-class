package file05;

import java.io.IOException;

public class SungDatasMain {
	public static void main(String[] args) {
		SungDatasExam wd = new SungDatasExam();
		try {
			wd.readingData("c:\\Temp\\writed.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}