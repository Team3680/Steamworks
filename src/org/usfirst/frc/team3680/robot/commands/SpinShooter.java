package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class SpinShooter extends Command {

    public SpinShooter() {
        requires(Robot.shooter);
        requires(Robot.primer);
    }

    protected void initialize() {
    	Robot.shooter.runShooter(-RobotMap.shooterSpeed);
    }

    protected void execute() {
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
