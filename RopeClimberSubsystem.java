package org.usfirst.frc.team6432.robot.subsystems;

import org.usfirst.frc.team6432.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RopeClimberSubsystem extends Subsystem {
	Victor climbMotor = new Victor(RobotMap.CLIMB_MOTOR); 

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void climb() {
		climbMotor.set(0.7);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void stop() {
    	climbMotor.set(0);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

