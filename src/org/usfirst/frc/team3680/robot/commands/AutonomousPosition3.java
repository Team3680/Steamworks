package org.usfirst.frc.team3680.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousPosition3 extends CommandGroup {

    public AutonomousPosition3() {
        addSequential(new DriveAuto(0, 0.8, 1.5));
    }
}
