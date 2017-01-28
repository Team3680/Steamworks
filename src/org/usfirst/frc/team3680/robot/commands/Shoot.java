package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class Shoot extends Command {

    public Shoot() {
        requires(Robot.shooter);
    }

    protected void initialize() {
    	Robot.shooter.releaseFuel(true);
    	Timer.delay(1);
    }

    protected void execute() {
    	Robot.shooter.runShooter(RobotMap.shooterSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.shooter.runShooter(0);
    }

    protected void interrupted() {
    	end();
    }
}
