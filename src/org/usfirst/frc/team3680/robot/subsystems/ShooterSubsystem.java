package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {
	
	private Talon shooterController;
	private Relay release;
	
	public ShooterSubsystem() {
		shooterController = new Talon(RobotMap.shooterControllerID);
		release = new Relay(RobotMap.shooterReleaseID);
	}
	
	public void runShooter(double speed) {
		shooterController.set(speed);
	}
	
	// releaseFuel does not work yet. TODO: Try different PWM cable to see if that is the issue.
	
	public void releaseFuel(boolean released){
		if (released = true) {
			release.set(Relay.Value.kForward);
		} else if (released = false) {
			release.set(Relay.Value.kReverse);
		} else {
			release.set(Relay.Value.kOff);
		}
	}

    public void initDefaultCommand() {
    	
    }
}

