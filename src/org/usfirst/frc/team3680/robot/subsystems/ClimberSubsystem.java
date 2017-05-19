package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimberSubsystem extends Subsystem {
	
	private Talon climberController;
	private Spark climberController2;

    public ClimberSubsystem() { 
    	climberController = new Talon(RobotMap.climberControllerID);
    	climberController2 = new Spark(RobotMap.climberControllerID2);
    }
    
    public void runClimber(double speed, double speed2) {
    	climberController.set(speed);
    	climberController2.set(speed2);
    }

    public void initDefaultCommand() {
        
    }
}

