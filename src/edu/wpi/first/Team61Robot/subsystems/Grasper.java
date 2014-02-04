/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.GrasperDoNothing;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class Grasper extends Subsystem {
    
    private boolean debugging = true;
        // Put methods for controlling this subsystem
        // here. Call these from Commands.

    private Solenoid graspInShift = new Solenoid (RobotMap.grasperInSolenoid) ;
    private Solenoid graspOutShift = new Solenoid (RobotMap.grasperOutSolenoid) ;


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GrasperDoNothing());
    }
    public void doNothing() {
        ;
    }
    public void shiftToGraspInOn() {
        if (debugging) {
            System.out.println("shiftToGraspIn - before");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
        graspInShift.set(true);
        if (debugging) {
            System.out.println("shiftToGraspIn - after");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
     }
    public void shiftToGraspInOff() {
        if (debugging) {
            System.out.println("shiftToGraspIn - before");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
        graspInShift.set(false);
        if (debugging) {
            System.out.println("shiftToGraspIn - after");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
     }
    public void shiftToGraspOutOn() {
        if (debugging) {
            System.out.println("shiftToGraspOut - before");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
        graspOutShift.set(true);

        if (debugging) {
            System.out.println("shiftToGraspOut - after");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
    }       
    public void shiftToGraspOutOff() {
        if (debugging) {
            System.out.println("shiftToGraspOut - before");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
        graspOutShift.set(false);

        if (debugging) {
            System.out.println("shiftToGraspOut - after");
            System.out.println("In Solenoid set to " + graspInShift.get());
            System.out.println("Out Solenoid set to  " + graspOutShift.get());
        }
    }
}       
