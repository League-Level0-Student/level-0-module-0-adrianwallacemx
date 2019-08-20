package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot adrian=new Robot();
	adrian.setSpeed(100);
	adrian.penDown();
	adrian.turn(30);
	adrian.move(200);
	adrian.turn(120);
	adrian.move(200);
	adrian.turn(180);
	adrian.move(100);
	adrian.turn(-60);
	adrian.move(110);
}
}
