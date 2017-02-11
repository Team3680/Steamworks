package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {
	
	private Talon shooterController;
	private Timer shooterTimer;
	
	public ShooterSubsystem() {
		shooterController = new Talon(RobotMap.shooterControllerID);
	}
	
	public void runShooter(double speed) {
		shooterController.set(speed);
	}
	
	public void startTimer() {
		shooterTimer.start();
	}
	
	public void stopTimer() {
		shooterTimer.stop();
	}
	
	public void resetTimer() {
		shooterTimer.reset();
	}
	
	public boolean shooterReady() {
		if(shooterTimer.get() < 2) {
			return false;
		} else {
			return true;
		}
	}
	
    public void initDefaultCommand() {
    	
    }
}

