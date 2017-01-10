package org.usfirst.frc.team3680.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class OI {
	private Joystick rightStick;
	private Joystick leftStick;
	
	public OI() {
		rightStick = new Joystick(RobotMap.rightStickPort);
		leftStick = new Joystick(RobotMap.leftStickPort);
		
		// Right Joystick (ex. setJoystickButtonWhenPressedCommand())
		
		// Left Joystick (ex. setJoystickButtonWhenPressedCommand())
		
	}
	
	public double getRightX() {
		if(!(rightStick == null)) {
			return rightStick.getX();
		} else {
			return 0;
		}
	}
	
	public double getRightY() {
		if(!(rightStick == null)) {
			return rightStick.getY();
		} else {
			return 0;
		}
	}
	
}
