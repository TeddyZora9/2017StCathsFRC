package org.usfirst.frc.team6432.robot.subsystems;

import org.usfirst.frc.team6432.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	RobotDrive driveTrain = new RobotDrive(RobotMap.LEFT_MOTOR, RobotMap.RIGHT_MOTOR);
	double ACCELERATION = 0.5;
	
	double finalMoving = 0;
	double finalTurning = 0;
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double moving, double turning) {
    	
    	finalMoving = moving * 0.65 + moving/Math.abs(moving)*0.35;
    	finalTurning = turning;
    	
    	if (Math.abs(moving) < 0.05) {
    		finalMoving = 0;
    		finalTurning = turning * 0.65 + turning/Math.abs(turning)*0.35;
    	}
    	
    	
    	
    	driveTrain.arcadeDrive(-finalMoving,-finalTurning*0.75);
    }
	
    public void driveAuto(double left, double right) {
    	driveTrain.tankDrive(left, right);
    }
    
		
}

