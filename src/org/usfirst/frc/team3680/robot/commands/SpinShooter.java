package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class SpinShooter extends Command {

    public SpinShooter() {
        requires(Robot.shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooter.runShooter(RobotMap.shooterSpeed);
    }

    protected boolean isFinished() {
        if(Robot.oi.rightStick.getRawButton(1) == false){
        	return true;
        } else {
        	return false;
        }
    }

    protected void end() {
    	Robot.shooter.runShooter(0);
    }

    protected void interrupted() {
    	end();
    }
}
