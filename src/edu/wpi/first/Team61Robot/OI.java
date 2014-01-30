
package edu.wpi.first.Team61Robot;

import edu.wpi.first.Team61Robot.commands.ArmapultRelease;
import edu.wpi.first.Team61Robot.commands.ShiftToArmlevate;
import edu.wpi.first.Team61Robot.commands.ShiftToArmapult;
import edu.wpi.first.Team61Robot.commands.ArmapultBack;
import edu.wpi.first.Team61Robot.commands.GraspIn;
import edu.wpi.first.Team61Robot.commands.GraspOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.

    Joystick jLeft = new Joystick(1);    
    Joystick jRight = new Joystick(2);   
    Joystick jThree = new Joystick(3);
    Joystick jFour = new Joystick(4);
    
    Button armapultButton = new JoystickButton(jFour, 1);
    Button armlevateButton = new JoystickButton(jFour, 2);
    
    Button graspInButton = new JoystickButton(jThree, 1);
    Button graspOutButton = new JoystickButton(jThree, 2);
    
    Button shooterRelease = new JoystickButton(jLeft, 1);
    Button shooterReset = new JoystickButton(jLeft, 2);
    
    Button forwardButton = new JoystickButton (jRight,2);
    Button reverseButton = new JoystickButton (jRight,3);

    private static boolean reverseDriveMode=false ;
    private static boolean armMode = false;

    // Button shootButton = new JoystickButton(jShooter, 1);
    
    // Anstatother type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
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
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    public OI() {
      armapultButton.whenPressed(new ShiftToArmapult());
      armlevateButton.whenPressed(new ShiftToArmlevate());
      
      graspInButton.whenPressed(new GraspIn());
      graspOutButton.whenPressed(new GraspOut());
      
      shooterRelease.whenPressed(new ArmapultRelease());
      shooterReset.whenPressed(new ArmapultBack());
    }
    /**
     *  Check drive and climb buttons to see if they are current;y pressed
     *  and set driveMode variable accordingly
     *  
     *  Note: if both are pressed, drive mode will take precedence
     * 
     * @return boolean 
     *         true means we are in armapult mode 
     *         false means we are in armlevate mode 
     */
    public boolean armToggle() {
        if (armapultButton.get()) {
            armMode = true;
        }
        else if (armlevateButton.get()) {
            armMode = false;
        }
        return armMode;
    }
    
    public boolean weAreReversing (){
        if (reverseButton.get()) {
            reverseDriveMode = false;
        }
        else if (forwardButton.get()) {
            reverseDriveMode= true;
        }
        return reverseDriveMode ;
    }
    
    public double getLeftSpeed() {
        return (jLeft.getY()); 
    }
    public double getRightSpeed() {
        return (jRight.getY());
    }
    public double getArmSpeed() {
        if (armToggle()) {
            // return only negative values for jThree
            return ((jThree.getY()>0.0)?(jThree.getY()*-1.0):0.0);
        } else {
            return (jFour.getY());
        }
    }
}

