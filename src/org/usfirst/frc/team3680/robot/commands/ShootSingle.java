package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class ShootSingle extends Command {

    public ShootSingle() {
        requires(Robot.shooter);
        requires(Robot.primer);
    }

    protected void initialize() {
    	Robot.shooter.runShooter(-RobotMap.shooterSpeed);
    	Timer.delay(4);
    	Robot.primer.primerUp();
    	Robot.shooter.runShooter(0);
    	Timer.delay(0.25);
    	Robot.shooter.runShooter(-RobotMap.shooterSpeed);
		Timer.delay(1);
		Robot.primer.primerDown();
		Timer.delay(1);
    }

    protected void execute() {
    	end();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	Robot.shooter.runShooter(0);
    }

    protected void interrupted() {
    	end();
    }
}
