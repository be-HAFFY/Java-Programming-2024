import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		//FileReader fin = null;
		InputStreamReader in = null;
		FileInputStream fis = null;
		
		try {
			//fin = new FileReader("c:\\windows\\system.ini");
			fis = new FileInputStream("C:\\Java2024-2\\week4\\hangul.txt");
			in = new InputStreamReader(fis);
			int c;
			
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			fis.close();
			in.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
