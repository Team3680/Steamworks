package org.usfirst.frc.team3680.robot;

import org.usfirst.frc.team3680.robot.commands.ClimbDown;
import org.usfirst.frc.team3680.robot.commands.ClimbDown2;
import org.usfirst.frc.team3680.robot.commands.ClimbUp;
import org.usfirst.frc.team3680.robot.commands.ClimbUp2;
import org.usfirst.frc.team3680.robot.commands.HexAnticlockwise;
import org.usfirst.frc.team3680.robot.commands.HexClockwise;
import org.usfirst.frc.team3680.robot.commands.PrimeFuel;
import org.usfirst.frc.team3680.robot.commands.Shoot;
import org.usfirst.frc.team3680.robot.commands.ShootSingle;
import org.usfirst.frc.team3680.robot.commands.SpinCameraBackward;
import org.usfirst.frc.team3680.robot.commands.SpinCameraForward;
import org.usfirst.frc.team3680.robot.commands.SpinShooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class OI {
	public Joystick rightStick;
	public Joystick leftStick;
	
	public OI() {
		rightStick = new Joystick(RobotMap.rightStickPort);
		leftStick = new Joystick(1);

		// DEPRECATED setJoystickButtonWhilePressedCommand(rightStick, 1, new Shoot());
		// DEPRECATED setJoystickButtonWhenPressedCommand(rightStick, 8, new SpinCameraForward());
		// DEPRECATED setJoystickButtonWhenPressedCommand(rightStick, 9, new SpinCameraBackward());
		// DEPRECATED setJoystickButtonWhenPressedCommand(rightStick, 10, new PrimeFuel());
		// DEPRECATED setJoystickButtonWhenPressedCommand(rightStick, 11, new ShootSingle());
		// DEPRECATED setJoystickButtonWhilePressedCommand(rightStick, 4, new SpinShooter());
		// DEPRECATED setJoystickButtonWhilePressedCommand(rightStick, 6, new HexClockwise());
		setJoystickButtonWhilePressedCommand(rightStick, 3, new ClimbUp());
		setJoystickButtonWhilePressedCommand(rightStick, 2, new ClimbDown());
		setJoystickButtonWhilePressedCommand(rightStick, 4, new ClimbUp2());
		setJoystickButtonWhilePressedCommand(rightStick, 5, new ClimbDown2());
	}
	
	private void setJoystickButtonWhilePressedCommand(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whileHeld(command);
	}
	
	private void setJoystickButtonWhenPressedCommand(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whenPressed(command);
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
