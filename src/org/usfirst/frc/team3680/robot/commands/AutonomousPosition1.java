package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousPosition1 extends CommandGroup {

    public AutonomousPosition1() {
    	addSequential(new DriveAuto(0,0.8,0.25));
        addSequential(new DriveAuto(0.75,0,0.75));
        addSequential(new DriveAuto(0,0.8,3));
    }
}
