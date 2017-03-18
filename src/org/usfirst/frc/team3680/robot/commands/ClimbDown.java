package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3680.robot.Robot;

public class ClimbDown extends Command {

    public ClimbDown() {
        requires(Robot.climber);
    }

    protected void initialize() {
    	Robot.climber.runClimber(-1);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.climber.runClimber(0);
    }

    protected void interrupted() {
    	end();
    }
}
