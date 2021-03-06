package org.usfirst.frc.team3680.robot;
public class RobotMap {
	
	// Drive Subsystem Motor Controllers (PWM)
	public static final int driveController1ID = 0;
	public static final int driveController2ID = 1;
	public static final int driveController3ID = 2;
	public static final int driveController4ID = 3;
	
	// Shooter Subsystem Motor Controller (PWM) DEPRECATED
	public static final int shooterControllerID = 5;
	
	// Climber Subsystem Motor Controller (PWM)
	public static final int climberControllerID = 4;
	
	// Intake Subsystem Motor Controller (PWM)
	public static final int intakeControllerID = 7;
	
	// Controller Speed 1 Climber (Speed)
	public static final double controllerSpeed1 = 0.25;
	
	// Controller Speed 2 Climber (Speed)
	public static final double controllerSpeed2 = 0.25;
	
	// Climber Subsystem Motor Controller (PWM 6)
	public static final int climberControllerID2 = 6;
	
	// Primer Servo (PWM)
	public static final int primerServoID = 8;
	
	// Camera Servo (PWM)
	public static final int servoID = 9;
	
	// Upper Switch (DIO)
	public static final int upperSwitchID = 0;
	
	// Drive Subsystem Constants
	public static final double driveSpeedTeleop = 1; // Percentage
	public static final double driveSpeedAuto = 0.75; // Percentage
	public static final double rotationSpeedTeleop = 0.75;
	
	// Shooter Subsystem Constants
	public static final double shooterSpeed = 1; //Percentage 75 IS WORK
	
	// Joystick Ports
	public static final int leftStickPort = 1;
	public static final int rightStickPort = 0;
	
}
