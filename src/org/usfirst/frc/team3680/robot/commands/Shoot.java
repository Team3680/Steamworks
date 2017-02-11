package org.usfirst.frc.team3680.robot.commands;

import org.usfirst.frc.team3680.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Shoot extends CommandGroup {

    public Shoot() {
    	requires(Robot.shooter);
    	requires(Robot.primer);
    	
    	addSequential(new SpinShooter());
    	addParallel(new ShooterHold());
    	addSequential(new PrimeFuel());
    	addParallel(new SpinShooter());
    }
}
