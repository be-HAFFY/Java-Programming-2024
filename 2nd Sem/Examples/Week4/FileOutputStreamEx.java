import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Java2024-2\\week4\\test.txt");
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("저장 실패. 경로를 확인해 주세요.");
		}
		System.out.println("C:\\Java2024-2\\week4\\test.txt 를 저장하였습니다.");
	}
}
