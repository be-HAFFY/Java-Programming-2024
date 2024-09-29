package Week2;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("김개똥", "수의사", 20);
		//p1.setAge(100);
		System.out.println("나는 " + p1.getName() + "이고, " + p1.getAge() + "살 " + p1.getJob() + "입니다.");
		p1.say("안녕하세요");
		p1.eat("제육덮밥");
		
		Person s1 = new Student("나천재", 12);
		System.out.println("나는 " + s1.getName() + "이고, " + s1.getAge() + "살 " + s1.getJob() + "입니다.");
		s1.walk("학교");
		if(s1 instanceof Student) ((Student) s1).study("국어");
		s1.eat("마라탕");
		
		Teacher t1 = new Teacher("홍길동", 45);
		System.out.println("나는 " + t1.getName() + "이고, " + t1.getAge() + "살 " + t1.getJob() + "입니다.");
		t1.teach("수학");
		t1.study("사회");
	}

}
