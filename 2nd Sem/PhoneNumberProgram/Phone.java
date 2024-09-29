//자바프로그래밍응용 002분반 2023864041 정지민

import java.io.*;
import java.util.*;

public class Phone {
	static Scanner in = new Scanner(System.in); //스캐너 클래스 변수로 선언
	static File file = new File("c:\\Temp\\Phone.txt"); //기본 파일 경로 선언

	public static void main(String[] args) {
		PrintStrings();
		while(in.hasNext()) {
			String command = in.next(); in.nextLine();
			switch (command) {
			case "입력": { WritePhoneNumber(file); PrintStrings(); break; }
			case "출력": { ReadPhoneNumber(file); PrintStrings(); break; }
			case "검색": { SearchPhoneNumber(file); PrintStrings(); break; }
			case "파일경로변경" : { getFileName(); PrintStrings(); break; } 
			case "종료": { 
				System.out.println("프로그램을 종료합니다.");
				in.close();
				System.exit(0);
				}
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public static void WritePhoneNumber(File f) { //실습문제 1. 전화번호 저장
		FileWriter fout = null;
		try {
			fout = new FileWriter(f);
			System.out.println("전화번호 입력 프로그램입니다.");
			System.out.println("입력 종료를 원할 시 \'그만\'을 입력해주세요.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = in.nextLine();
				if(line.equals("그만")) break;
				if(isCorrect(line)) { //입력 정보 판별 후 저장
					fout.write(line, 0, line.length());
					fout.write("\r\n", 0, 2);
				}
				else {
					System.out.println("올바른 입력 형식이 아닙니다.");
				}
			}
			System.out.println(f.getPath()+"에 저장하였습니다.");
			fout.close();
		} catch (IOException e) {
			System.out.println("작성에 실패하였습니다. 경로를 확인해보세요.");
		}
	}
	
	public static void ReadPhoneNumber(File f) { //실습문제 2. 전화번호 출력
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader(f);
			System.out.println(f.getPath()+"를 출력합니다.");
			while((c = fin.read())!= -1) {
				System.out.print((char)c);
			}
			fin.close();
			
		} catch (IOException e) {
			System.out.println("출력에 실패하였습니다. 경로를 확인해보세요.");
		}
	}
	
	public static void SearchPhoneNumber(File f) { //실습문제 10. 전화번호 검색
		HashMap<String, String> nums = new HashMap<>();
		int count = 0;
		try {
			BufferedReader bin = new BufferedReader(new FileReader(f));
			String line;
			while((line = bin.readLine()) != null) {
				String[] data = line.split(" ");
				nums.put(data[0], data[1]);
				count++;
			}
			System.out.printf("총 %d개의 전화번호를 읽었습니다.\n", count);
			bin.close();
			
			System.out.println("검색 종료를 원할 시 \'그만\'을 입력해주세요.");
			while(true) {
				System.out.print("이름 검색 >> ");
				String text = in.nextLine();
				
				if(text.equals("그만")) break;
				
				if(nums.containsKey(text)) {
					System.out.println(nums.get(text));
				}
				else {
					System.out.println("찾는 이름이 없습니다.");
				}
			}
		} catch (IOException e) {
			System.out.println("파일을 읽어오지 못했습니다. 경로를 확인해보세요.");
		}
	}
	
	private static void getFileName() { //파일 경로 입력 메서드
		String File_name = null;
		while(true) {
			System.out.print("경로를 입력해 주세요 >> ");
			File_name = in.next(); in.nextLine();
			file = new File(File_name);
			if(file.exists()) break;
			else System.out.println("파일을 찾을 수 없습니다.");
		}
	}
	
	private static void PrintStrings() { //문구 출력 간편화
		System.out.println("===== 전화번호부 프로그램 =====");
		System.out.println("현재 파일 경로 : "+file.getPath());
		System.out.println("\'입력\' \'출력\' \'검색\' \'파일경로변경\' 중 원하는 기능을 입력해주세요.");
		System.out.println("\'종료\' 입력 시 프로그램이 종료됩니다.");
	}
	
	private static boolean isCorrect(String line) { //이름, 전화번호 형식 판별
		String[] data = line.split(" ");
		
		if(data.length != 2) return false;
		
		String name = data[0];
	    String number = data[1];
		
	    if(name.length() > 0 && number.matches("\\d{3}-\\d{4}-\\d{4}")) return true;
	    
	    return false;
	}
	
}
