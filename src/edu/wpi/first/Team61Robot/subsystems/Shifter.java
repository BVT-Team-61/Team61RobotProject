/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.ShiftToArmapult;
import edu.wpi.first.Team61Robot.commands.ShifterDoNothing;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class Shifter extends Subsystem {
    
    private boolean debugging = true;
        // Put methods for controlling this subsystem
        // here. Call these from Commands.

    private Solenoid armlevateShift = new Solenoid (RobotMap.armlevateSolenoid) ;
    private Solenoid armapultShift = new Solenoid (RobotMap.armapultSolenoid) ;


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ShifterDoNothing());
    }
    public void doNothing() {
        ;
    }
public void shiftToArmlevateOn() {
//insert command here     
    if (debugging) {
        System.out.println("shiftToArmlevate - before");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
    armlevateShift.set(true);
    if (debugging) {
        System.out.println("shiftToDrive - after");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
 }
public void shiftToArmlevateOff() {
//insert command here     
    if (debugging) {
        System.out.println("shiftToDrive - before");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
    armlevateShift.set(false);
    if (debugging) {
        System.out.println("shiftToDrive - after");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
 }
public void shiftToArmapultOn() {
    if (debugging) {
        System.out.println("shiftToClimb - before");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
    armapultShift.set(true);

    if (debugging) {
        System.out.println("shiftToClimb - after");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
}       
public void shiftToArmapultOff() {
    if (debugging) {
        System.out.println("shiftToClimb - before");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
    armapultShift.set(false);

    if (debugging) {
        System.out.println("shiftToClimb - after");
        System.out.println("Drive Solenoid set to " + armlevateShift.get());
        System.out.println("Arm Solenoid set to  " + armapultShift.get());
    }
}           
        
        
        
}       
