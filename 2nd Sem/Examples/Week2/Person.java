package Week2;

public class Person {
	//fields
	private String name, job;
	private int age;
	
	//constructors
	public Person() {
		this("(이름 없음)","(무직)",10);
	}
	public Person(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}
	
	//setter
	public void setAge(int age) {
		if(age > 0) this.age = age;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	
	//methods
	private int GetLastUni(String s) {
		char Lastchar = s.charAt(s.length()-1);
		int uni = (Lastchar - 0xAC00) % 28;
		return uni;
	}
	public void eat(String s) {
		int Unicode = GetLastUni(s);
		if(Unicode == 0) System.out.println(s + "를 먹습니다.");
		else System.out.println(s + "을 먹습니다.");
	}
	public void say(String s) {
		System.out.println("\"" + s + "\"라고 말합니다.");
	}
	public void walk(String s) {
		System.out.println(s + "로 걸어갑니다.");
	}
	
}
