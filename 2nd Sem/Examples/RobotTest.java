//2023864041 Jeong Jimin

import java.util.*;

class Robot{
	int[] dx = {0,1,0,-1};
	int[] dy = {1,0,-1,0};
	
	int x, y, direction;
	Robot(){
		x = 0;
		y = 0;
		direction = 0;
	}
	void turnR() {
		direction = (direction + 1) % 4;
	}
	void turnL() {
		direction = (direction + 3) % 4;
	}
	void go() {
		x += dx[direction];
		y += dy[direction];
	}
	void back() {
		x -= dx[direction];
		y -= dy[direction];
	}
	
}


public class RobotTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String command = s.next();
		System.out.println(Arrays.toString(robottest(command)));
	}
	public static int[] robottest(String command) {
		Robot myRobot = new Robot();
		for(int i=0; i<command.length(); i++) {
			char c = command.charAt(i);
			if(c == 'R')	myRobot.turnR();
			else if(c == 'L')	myRobot.turnL();
			else if(c == 'G')	myRobot.go();
			else if(c == 'B')	myRobot.back();
		}
		return new int[] {myRobot.x, myRobot.y};
	}

}
