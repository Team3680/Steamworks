package org.usfirst.frc.team3680.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;

public class IntakeSubsystem extends Subsystem {
	
	private Spark intakeController;
	private DigitalInput upperSwitch;

	public IntakeSubsystem() {
		intakeController = new Spark(RobotMap.intakeControllerID);
		upperSwitch = new DigitalInput(RobotMap.upperSwitchID);
	}
	
	public void runIntake(double speed) {
		intakeController.set(speed);
	}
	
	public boolean climbingLimitSwitchCheck() {
		return upperSwitch.get();
	}

    public void initDefaultCommand() {
        
    }
}

