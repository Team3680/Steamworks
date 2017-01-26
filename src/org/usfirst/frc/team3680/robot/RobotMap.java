package org.usfirst.frc.team3680.robot;

public class RobotMap {
	
	// Drive Subsystem Motor Controllers (PWM)
	public static final int driveController1ID = 0;
	public static final int driveController2ID = 1;
	public static final int driveController3ID = 2;
	public static final int driveController4ID = 3;
	
	// Shooter Subsystem Motor Controller (PWM)
	public static final int shooterControllerID = 4;
	
	// Drive Subsystem Constants
	public static final double driveSpeedTeleop = 1; // Percentage
	public static final double driveSpeedAuto = 0.8; // Percentage
	
	// Shooter Subsystem Constants
	public static final double shooterSpeed = 1; //Percentage
	
	// Joystick Ports
	public static final int leftStickPort = 0;
	public static final int rightStickPort = 1;
}
