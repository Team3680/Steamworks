package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimberSubsystem extends Subsystem {
	
	private Talon climberController;

    public ClimberSubsystem() { 
    	climberController = new Talon(RobotMap.climberControllerID);
    }
    
    public void runClimber(double speed) {
    	climberController.set(speed);
    }

    public void initDefaultCommand() {
        
    }
}

