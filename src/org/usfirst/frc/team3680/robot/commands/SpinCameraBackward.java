package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinCameraBackward extends Command {

    public SpinCameraBackward() {
        requires(Robot.cameraServo);
    }

    protected void initialize() {
    		Robot.cameraServo.reverseServo();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
    	if(Robot.cameraServo.getServoAngle() > 170){
        	return true;
        	
        } else {
        	return false;
        }
    }

    protected void end() {
    }
    
    protected void interrupted() {
    }
}
