
package org.usfirst.frc.team3680.robot;

import org.usfirst.frc.team3680.robot.subsystems.CameraServoSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.IntakeSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.ShooterSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends IterativeRobot {
	
	public static DriveSubsystem driveTrain;
	public static ShooterSubsystem shooter;
	public static IntakeSubsystem intake;
	public static CameraServoSubsystem cameraServo;
	public static OI oi;

	@Override
	public void robotInit() {
		driveTrain = new DriveSubsystem();
		shooter = new ShooterSubsystem();
		intake = new IntakeSubsystem();
		cameraServo = new CameraServoSubsystem();
		oi = new OI();
		
    	CameraServer.getInstance().addServer("cam0");
    	CameraServer.getInstance().putVideo("robotCam", 320, 240);
    	CameraServer.getInstance().startAutomaticCapture(0);
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
