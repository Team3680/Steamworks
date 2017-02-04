package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinCameraForward extends Command {

    public SpinCameraForward() {
        requires(Robot.cameraServo);
    }

    protected void initialize() {
    	Robot.cameraServo.forwardServo();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        if(Robot.cameraServo.getServoAngle() < 10){
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
