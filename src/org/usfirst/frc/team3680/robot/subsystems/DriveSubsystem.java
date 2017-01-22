package org.usfirst.frc.team3680.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3680.robot.RobotMap;
import org.usfirst.frc.team3680.robot.commands.DriveTeleop;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Spark;

public class DriveSubsystem extends Subsystem {
	
	private Spark left1, right1;
	private Victor left2, right2;
	private RobotDrive robotDrive;

	public DriveSubsystem() {
		left1 = new Spark(RobotMap.driveController1ID); // Front Left
		left2 = new Victor(RobotMap.driveController2ID); // Rear Left
		right1 = new Spark(RobotMap.driveController3ID); // Front Right
		right2 = new Victor(RobotMap.driveController4ID); // Rear Right
		left1.set(left2.get());
		right2.set(right1.get());
		robotDrive = new RobotDrive(left2, right1);
		
	}
	
	public void arcadeDrive(double forward, double rotation) {
		robotDrive.arcadeDrive(forward, rotation);
		left1.set(left2.get());
		right2.set(right1.get());
	}
	
	public void driveStraight(double speed) {
		moveLeftSide(speed);
		moveRightSide(speed);
	}
	
	public void moveLeftSide(double speed) {
		left2.set(speed);
		left1.set(speed);
	}
	
	public void moveRightSide(double speed) {
		right1.set(speed);
		right2.set(speed);
	}
	

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveTeleop());
    }
}

