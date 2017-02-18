package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class HexClockwise extends Command {

    public HexClockwise() {
        requires(Robot.hex);
    }

    protected void initialize() {
    	Robot.hex.runHex(1);
    }

    protected void execute() {
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
