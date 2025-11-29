package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {

	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot egg = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		egg.setX(300);
		egg.setY(300);
		// #3. Put the robot's pen down
		egg.penDown();

		// #4. Set the robot’s speed to 5
		egg.setSpeed(5);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
		for(int i = 0; i <6; i +=1) {
			
		

			// #6. Set the pen color to black
			egg.setPenColor(0,0,0);
	
			// #7. move the robot by 50
			egg.move(50);
	
			// #8. turn the robot to the right by 60
			egg.turn(60);
			
			// #12. set the pen color to red for all odd numbers of i
			if(i % 2 == 1) {
				egg.setPenColor(219,42,42);
			}
	
			// #13. set the pen color to blue for even numbers of i
			else {
				egg.setPenColor(42,95,219);
			}
	
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
		
		for(int j = 0; j < 6; j +=1) {
			
		
	
				// #10. turn the robot to the left by 60
			egg.turn(-60);
		
				// #11. move the robot by 50 (play the start button)
			egg.move(50);
		}
	
			// #14. set the pen color to black
			egg.setPenColor(0,0,0);
		
		}
		egg.penUp();
		egg.setX(10000);
	}

}
