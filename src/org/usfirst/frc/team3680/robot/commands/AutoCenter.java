package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoCenter extends CommandGroup {
	public AutoCenter(){
		addSequential(new DriveAuto(0, 0.8, 1));
		addSequential(new DriveAuto(0, -0.2, 3));
	}
}
