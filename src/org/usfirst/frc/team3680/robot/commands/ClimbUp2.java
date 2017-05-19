package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3680.robot.OI;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class ClimbUp2 extends Command {

    public ClimbUp2() {
        requires(Robot.climber);
    }

    protected void initialize() {
    	Robot.climber.runClimber(1, 1);
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
