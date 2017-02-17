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
    	Timer.delay(3);
    	Robot.primer.primerUp();
		Timer.delay(0.5);
		Robot.primer.primerDown();
		Timer.delay(0.5);
    }

    protected void execute() {
    		
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.shooter.runShooter(0);
    	Robot.primer.primerDown();
    }

    protected void interrupted() {
    	end();
    }
}
