package org.usfirst.frc.team3680.robot;

import org.usfirst.frc.team3680.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class OI {
	private Joystick rightStick;
	
	public OI() {
		rightStick = new Joystick(RobotMap.rightStickPort);
		
		// Right Joystick (ex. setJoystickButtonWhenPressedCommand())
		setJoystickButtonWhilePressedCommand(rightStick, 1, new Shoot());

		// Left Joystick (ex. setJoystickButtonWhenPressedCommand())
		
	}
	
	private void setJoystickButtonWhilePressedCommand(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whileHeld(command);
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
