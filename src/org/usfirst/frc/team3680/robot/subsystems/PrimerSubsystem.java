package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PrimerSubsystem extends Subsystem {
	
	Servo primerServo = new Servo(RobotMap.primerServoID);

	public void primerUp() {
		primerServo.setAngle(180);
	}
	
	public void primerDown() {
		primerServo.setAngle(0);
	}

    public void initDefaultCommand() {
    }
}

