package org.usfirst.frc.team3680.robot;

import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc.team3680.robot.subsystems.CameraServoSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.IntakeSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.ShooterSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.VisionThread;


public class Robot extends IterativeRobot {
	
	public static DriveSubsystem driveTrain;
	public static ShooterSubsystem shooter;
	public static IntakeSubsystem intake;
	public static CameraServoSubsystem cameraServo;
	public static OI oi;
	public SmartDashboard dashboard;

	Thread visionThread;

	int objectsFound = 0;
	private final Object imgLock = new Object();
	
	@Override
	public void robotInit() {
		driveTrain = new DriveSubsystem();
		shooter = new ShooterSubsystem();
		intake = new IntakeSubsystem();
		cameraServo = new CameraServoSubsystem();
		oi = new OI();
		dashboard = new SmartDashboard();
    	
    	driveTrain.gyro.reset();
    	
    	UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
		camera.setExposureManual(100);

		visionThread = new VisionThread(camera, new GripPipeline(), gp -> {
			synchronized (imgLock) {
				objectsFound = gp.filterContoursOutput().size();
			}
		});
		
		visionThread.setDaemon(true);
		visionThread.start();
		
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
