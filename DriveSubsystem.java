package org.usfirst.frc.team6432.robot.subsystems;

import org.usfirst.frc.team6432.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	RobotDrive driveTrain = new RobotDrive(RobotMap.LEFT_MOTOR, RobotMap.RIGHT_MOTOR);
	double acceleration = 0.5;
	
	double finalMoving = 0;
	double finalTurning = 0;
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double moving, double turning) {
    	if (Math.abs(finalMoving) > Math.abs(moving)) {
    		finalMoving = moving;
    	}
    	
    	if (Math.abs(finalTurning) > Math.abs(turning)) {
    		finalTurning = turning;
    	}
    	
    	finalMoving += (finalMoving-moving)*acceleration;
    	finalTurning += (finalTurning-turning)*acceleration;
    	
    	driveTrain.arcadeDrive(finalMoving,finalTurning)
    }
}

