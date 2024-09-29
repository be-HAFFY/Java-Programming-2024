import java.io.*;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		try {
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 20);
			FileReader fin = new FileReader("c:\\windows\\system.ini");
			
			int c; 
			while((c=fin.read()) != -1) {
				bout.write((char)c);
			}
			bout.close();
			fin.close();
			
		} catch (IOException e) {
			System.out.println("파일 읽기 실패");
		}
	}
}