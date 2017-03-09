package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateToBoiler extends Command {

    public RotateToBoiler() {
        requires(Robot.driveTrain);
    }

    protected void initialize() {
    	Robot.driveTrain.arcadeDrive(0, 0.5);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        if(Robot.driveTrain.getGyroAngle() > -55 && Robot.driveTrain.getGyroAngle() < -35){
        	return true;
        } else {
        	return false;
        }
    }

    protected void end() {
    	Robot.driveTrain.arcadeDrive(0, 0);
    }

    protected void interrupted() {
    }
}
