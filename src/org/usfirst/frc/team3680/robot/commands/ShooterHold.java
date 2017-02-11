package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShooterHold extends Command {

    public ShooterHold() {
        requires(Robot.shooter);
    }

    protected void initialize() {
    	Robot.shooter.startTimer();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        if(Robot.oi.rightStick.getRawButton(1) == false){
        	return true;
        } else {
        	return Robot.shooter.shooterReady();
        }
        
    }

    protected void end() {
    	Robot.shooter.stopTimer();
    	Robot.shooter.resetTimer();
    }

    protected void interrupted() {
    	end();
    }
}
