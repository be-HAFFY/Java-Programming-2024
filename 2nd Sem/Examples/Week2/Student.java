package Week2;

public class Student extends Person {
	public Student() { super(); }
	public Student(String name, int age) {
		super(name, "학생", age);
	}
	public void eat(String s) {
		System.out.println("오늘 급식은 "+s+"입니다.");
	}
	public void study(String s) {
		System.out.println(s+"를 공부합니다.");
	}
}
