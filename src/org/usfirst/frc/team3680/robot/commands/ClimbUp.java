package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3680.robot.OI;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class ClimbUp extends Command {

    public ClimbUp() {
        requires(Robot.climber);
    }

    protected void initialize() {
    	Robot.climber.runClimber(0.25, 0.25);
    	//Robot.climber.runClimber(Robot.setSpeed1, Robot.setSpeed2);
    	
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.climber.runClimber(0,0);
    }

    protected void interrupted() {
    	end();
    }
}
