package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checpoint {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("what is your favorite color");
	JOptionPane.showMessageDialog(null,input+" is also my favorite color as well");
	Robot adrian=new Robot();
	adrian.penDown();
	adrian.setSpeed(100);
	adrian.turn(20);
	adrian.move(150);
	adrian.turn(120);
	adrian.move(150);
	adrian.turn(120);
	adrian.move(150);
}
}
