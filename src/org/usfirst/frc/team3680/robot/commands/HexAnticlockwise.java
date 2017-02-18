package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class HexAnticlockwise extends Command {

    public HexAnticlockwise() {
        requires(Robot.hex);
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	Robot.hex.runHex(-1);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.hex.runHex(0);
    }

    protected void interrupted() {
    	end();
    }
}
