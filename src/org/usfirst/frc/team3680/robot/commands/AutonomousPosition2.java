package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousPosition2 extends CommandGroup {
    public AutonomousPosition2() {
        addSequential(new DrivePreciseForward());
    }
}
