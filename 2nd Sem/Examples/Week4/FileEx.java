import java.io.*;

public class FileEx {
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + "\n" + f1.getParent() + "\n" + f1.getName());
		String res = "";
		if(f1.isFile()) {
			res = "파일";
		}
		else if(f1.isDirectory()) {
			res = "디렉토리";
		}
		System.out.println(f1.getPath() +"은 "+ res + "입니다.");
		//listDirectory(new File("C:\\Java2024-2\\"));
		
		File f2 = new File("c:\\Java2024-2\\java_sample");
		if(!f2.exists()) {
			f2.mkdir();
		}
		listDirectory(new File("C:\\Java2024-2\\"));
		f2.renameTo(new File("c:\\Java2024-2\\javasample"));
		listDirectory(new File("C:\\Java2024-2\\"));
	}
	
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() +"의 서브리스트-----");
		File[] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t파일 크기 : "+f.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
}
