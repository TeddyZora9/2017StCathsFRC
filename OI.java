package org.usfirst.frc.team6432.robot;

import org.usfirst.frc.team6432.robot.commands.RopeClimberCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick joystick = new Joystick(0);
	Joystick xbox = new Joystick(1);
	
	Button button1 = new JoystickButton(joystick, 1);
	Button button2 = new JoystickButton(joystick, 2);
	Button button3 = new JoystickButton(joystick, 3);
	Button button4 = new JoystickButton(joystick, 4);
	Button button5 = new JoystickButton(joystick, 5);
	Button button6 = new JoystickButton(joystick, 6);
	Button button7 = new JoystickButton(joystick, 7);
	Button button8 = new JoystickButton(joystick, 8);
	Button button9 = new JoystickButton(joystick, 9);
	Button button10 = new JoystickButton(joystick, 10);
	Button button11 = new JoystickButton(joystick, 11);
	Button button12 = new JoystickButton(joystick, 12);	
	Button buttonA = new JoystickButton(xbox, 1);
	Button buttonB = new JoystickButton(xbox, 2);
	Button buttonX = new JoystickButton(xbox, 3);
	Button buttonY = new JoystickButton(xbox, 4);
	Button buttonLB = new JoystickButton(xbox, 5);
	Button buttonRB= new JoystickButton(xbox, 6);
	Button buttonSTART = new JoystickButton(xbox, 7);
	Button buttonSELECT = new JoystickButton(xbox, 8);
	Button buttonL3 = new JoystickButton(xbox, 9);
	Button buttonR3 = new JoystickButton(xbox, 10);
	
	public OI() {
		button8.whileHeld(new RopeClimberCommand());
	}
}
	
	


	
	
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

