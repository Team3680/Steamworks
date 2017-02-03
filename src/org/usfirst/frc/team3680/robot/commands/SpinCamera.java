package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinCamera extends Command {

    public SpinCamera() {
        requires(Robot.cameraServo);
    }

    protected void initialize() {
    	if(Robot.cameraServo.getServoAngle() > 150){
    		Robot.cameraServo.forwardServo();
    	} else {
    		Robot.cameraServo.reverseServo();
    	}
    	
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }
    
    protected void interrupted() {
    }
}
