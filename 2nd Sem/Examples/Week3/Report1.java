//2023864041 Jeong Jimin

import java.util.HashMap;
import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()) {
			String[] words = input.nextLine().split(" ");
			String result = "";
			
			for(String w : words) {
				result += morseToCharacter(w);
			}
			
			System.out.println(result);
		}
		
		input.close();
		
	}
	
	public static Character morseToCharacter(String words) {
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		HashMap<String, Character> morseMap = new HashMap<>();
		char start = 'a';
		
		for(String s : morse) {
			morseMap.put(s, start++);
		}
		
		return morseMap.get(words);
	}

}
