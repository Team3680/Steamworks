package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class PrimeFuel extends Command {

    public PrimeFuel() {
        requires(Robot.primer);
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	Robot.primer.primerUp();
    	Timer.delay(1);
    	Robot.primer.primerDown();
    }

    protected boolean isFinished() {
        if(Robot.oi.rightStick.getRawButton(1) == false){
        	return true;
        } else {
        	return false;
        }
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    }
}
