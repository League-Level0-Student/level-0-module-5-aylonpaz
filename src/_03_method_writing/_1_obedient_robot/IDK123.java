package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class IDK123 {
	
	public static void main(String []args) {
		Robot rob = new Robot();
		rob.setX(300);
		rob.setSpeed(100);
		rob.penDown();
		String huh = JOptionPane.showInputDialog("What shape u wanna drw???");
		if(huh.toLowerCase().contains("Circle")) {
			SKREEKL(rob);
		}
		else if(huh.toLowerCase().contains("Square")) {
			robotDrawSquare(rob);
		}
		else if(huh.toLowerCase().contains("Triangle")) {
			treeangll(rob);
		}
	}	
	public static void treeangll(Robot rob) {
		rob.turn(90);
		rob.move(200);
		for(int w = 0; w < 2; w +=1) {
			rob.turn(-120);
			rob.move(200);
		}
		
	}
	public static void SKREEKL(Robot rob) {
		for(int turn = 0; turn < 360; turn +=1) {
			rob.turn(1);
			rob.move(3);
		}
	}
public static void robotDrawSquare(Robot rob) {
	for(int e = 0; e < 4; e +=1) {
	rob.turn(90);
	rob.move(200);
	}
}

}
