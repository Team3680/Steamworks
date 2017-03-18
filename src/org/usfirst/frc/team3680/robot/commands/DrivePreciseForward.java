package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DrivePreciseForward extends Command {

    public DrivePreciseForward() {
        requires(Robot.driveTrain);
    }

    protected void initialize() {
    	setTimeout(4);
    	Robot.driveTrain.arcadeDrive(0, 0.64);
    	Timer.delay(2.25);
    	Robot.driveTrain.arcadeDrive(0, -0.25);
    }

    protected void execute() {
    	/**if(Robot.driveTrain.getGyroAngle() < -10) {
    		Robot.driveTrain.arcadeDrive(0,0.5);
    	} else if (Robot.driveTrain.getGyroAngle() > 10) {
    		Robot.driveTrain.arcadeDrive(0,-0.5);
    	} else {
    		Robot.driveTrain.arcadeDrive(0.5, 0);
    	}**/
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.driveTrain.arcadeDrive(0, 0);
    }

    protected void interrupted() {
    }
}
