package org.usfirst.frc.team3680.robot.subsystems;

import org.usfirst.frc.team3680.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CameraServoSubsystem extends Subsystem {

    Servo servo = new Servo(RobotMap.servoID);
    
    public void forwardServo() {
		servo.setAngle(0);
	}
    
    public void reverseServo() {
    	servo.setAngle(180);
    }
    
    public double getServoAngle() {
    	return servo.getAngle();
    }

    public void initDefaultCommand() {
        
    }
}

