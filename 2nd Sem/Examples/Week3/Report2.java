//2023864041 Jeong Jimin

import java.util.*;

public class Report2 {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size()!=6) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
	}
}
