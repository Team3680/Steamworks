package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3680.robot.Robot;
import org.usfirst.frc.team3680.robot.RobotMap;

public class Shoot extends Command {

    public Shoot() {
        requires(Robot.shooter);
        requires(Robot.primer);
    }

    protected void initialize() {
    	Robot.shooter.runShooter(-RobotMap.shooterSpeed);
    	Timer.delay(3);
    	System.out.println("Shoot initialized");
    }

    protected void execute() {
    		Robot.primer.primerUp();
    		Timer.delay(1);
    		Robot.primer.primerDown();
    		Timer.delay(0.5);
    		System.out.println("Shoot executing");
    }

    protected boolean isFinished() {
        /**if(Robot.oi.rightStick.getRawButton(1) == false){
        	return true;
        } else {
        	return false;
        }**/
    	return true;
    }

    protected void end() {
    	Robot.shooter.runShooter(0);
    	Robot.primer.primerDown();
    	System.out.println("Shoot ending");
    }

    protected void interrupted() {
    	end();
    }
}
