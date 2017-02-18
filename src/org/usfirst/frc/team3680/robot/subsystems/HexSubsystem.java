package org.usfirst.frc.team3680.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;

public class HexSubsystem extends Subsystem {
	
	private Spark hexController;
	private DigitalInput upperSwitch;

	public HexSubsystem() {
		hexController = new Spark(RobotMap.intakeControllerID);
		upperSwitch = new DigitalInput(RobotMap.upperSwitchID);
	}
	
	public void runHex(double speed) {
		hexController.set(speed);
	}
	
	public boolean climbingLimitSwitchCheck() {
		return upperSwitch.get();
	}

    public void initDefaultCommand() {
        
    }
}

