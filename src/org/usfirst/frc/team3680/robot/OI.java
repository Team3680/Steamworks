package org.usfirst.frc.team3680.robot;

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
	
	public OI() {
		rightStick = new Joystick(RobotMap.rightStickPort);

		setJoystickButtonWhilePressedCommand(rightStick, 5, new Shoot());
		setJoystickButtonWhenPressedCommand(rightStick, 8, new SpinCameraForward());
		setJoystickButtonWhenPressedCommand(rightStick, 9, new SpinCameraBackward());
		setJoystickButtonWhenPressedCommand(rightStick, 6, new PrimeFuel());
		setJoystickButtonWhenPressedCommand(rightStick, 7, new ShootSingle());
		setJoystickButtonWhilePressedCommand(rightStick, 4, new SpinShooter());
		setJoystickButtonWhilePressedCommand(rightStick, 11, new HexClockwise());
		setJoystickButtonWhilePressedCommand(rightStick, 10, new HexAnticlockwise());
		
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
