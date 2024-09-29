package week3;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toStirng() {
		return "Point("+x+","+y+")";
	}
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return p.x == x && p.y == y;
	}
}

public class ObjectClassTest {
	public static void main(String[] args) {
		Point p1 = new Point(10, 16);
		Point p2 = new Point(10, 16);
		Point p3 = p1;
		
		System.out.println(p1 == p2);
		System.out.println((p1 == p3));
		System.out.println(p1.equals(p3));
		
		String str1 = "hi";
		System.out.println(str1.equals("hi"));
		
		//System.out.println(p1.getClass());
		//System.out.println(p1.toString());
		//System.out.println(p1.hashCode());
	}
}
