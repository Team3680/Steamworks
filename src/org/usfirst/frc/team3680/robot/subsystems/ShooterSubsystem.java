package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {
	
	private Talon shooterController;
	
	public ShooterSubsystem() {
		shooterController = new Talon(RobotMap.shooterControllerID);
	}
	
	public void runShooter(double speed) {
		shooterController.set(speed);
	}

    public void initDefaultCommand() {
    }
}

