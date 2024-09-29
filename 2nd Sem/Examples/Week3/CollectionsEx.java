package week3;

import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String e = it.next();
			String separator;
			if(it.hasNext()) {
				separator = "->";
			}
			else {
				separator = "\n";
			}
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");
		//System.out.println(myList);
		printList(myList);
		Collections.sort(myList);
		printList(myList);
	}
}
