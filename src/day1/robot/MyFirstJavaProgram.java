package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot c3PO = new Robot("mini");
		c3PO.sparkle();
		c3PO.setSpeed(10);
		c3PO.moveTo(200, 200);
		c3PO.turn(90);
		c3PO.move(100);

	}
}
