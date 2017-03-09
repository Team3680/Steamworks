package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveAuto extends Command {

	public double speed;
	public double rotate;
	public double timeout;
	
    public DriveAuto(double driveSpeed, double rotation, double time) {
        requires(Robot.driveTrain);
        speed = driveSpeed;
        timeout = time;
        rotate = rotation;
    }

    protected void initialize() {
    	setTimeout(timeout);
    	Robot.driveTrain.arcadeDrive(speed, rotate);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.driveTrain.arcadeDrive(0,0);
    }

    protected void interrupted() {
    }
}
