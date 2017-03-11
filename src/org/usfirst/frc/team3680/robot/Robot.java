package org.usfirst.frc.team3680.robot;

import org.usfirst.frc.team3680.robot.commands.AutonomousDoNothing;
import org.usfirst.frc.team3680.robot.commands.AutonomousPosition1;
import org.usfirst.frc.team3680.robot.commands.AutonomousPosition2;
import org.usfirst.frc.team3680.robot.commands.AutonomousPosition3;
import org.usfirst.frc.team3680.robot.subsystems.CameraServoSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.HexSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.PrimerSubsystem;
import org.usfirst.frc.team3680.robot.subsystems.ShooterSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.VisionThread;


public class Robot extends IterativeRobot {
	
	public static DriveSubsystem driveTrain;
	public static ShooterSubsystem shooter;
	public static HexSubsystem hex;
	public static CameraServoSubsystem cameraServo;
	public static PrimerSubsystem primer;
	public static OI oi;
	public SmartDashboard dashboard;
	public Ultrasonic ultrasonic;
	public PowerDistributionPanel pdp;
	
	SendableChooser<Command> chooser = new SendableChooser<>();
	Command autonomousCommand;
	
	Thread visionThread;

	int objectsFound = 0;
	private final Object imgLock = new Object();
	
	@Override
	public void robotInit() {
		driveTrain = new DriveSubsystem();
		shooter = new ShooterSubsystem();
		hex = new HexSubsystem();
		cameraServo = new CameraServoSubsystem();
		primer = new PrimerSubsystem();
		oi = new OI();
		dashboard = new SmartDashboard();
		ultrasonic = new Ultrasonic(5,6);
    	pdp = new PowerDistributionPanel();
    	driveTrain.gyro.reset();
    	
    	UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
		camera.setExposureManual(50);

		visionThread = new VisionThread(camera, new GripPipeline(), gp -> {
			synchronized (imgLock) {
				objectsFound = gp.filterContoursOutput().size();
			}
		});
		
		visionThread.setDaemon(true);
		visionThread.start();
		
		ultrasonic.setAutomaticMode(true);
		
		chooser.addDefault("Do Nothing", new AutonomousDoNothing());
		chooser.addObject("Position 1", new AutonomousPosition1());
		chooser.addObject("Position 2" , new AutonomousPosition2());
		chooser.addObject("Position 3", new AutonomousPosition3());
		SmartDashboard.putData("Auto Mode", chooser);
		
		System.out.println(Robot.driveTrain.getGyroAngle());
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
		autonomousCommand = chooser.getSelected();
		if (autonomousCommand != null)
			autonomousCommand.start();
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
