/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.Team61Robot.commands.ArmapultDoNothing;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Owen
 */
public class Armapult extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Solenoid release = new Solenoid (RobotMap.armapultInSolenoid);
    private Solenoid back = new Solenoid (RobotMap.armapultOutSolenoid);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ArmapultDoNothing());
    }
    public void doNothing(){
    ;
    }
    public void releaseOff(){
        release.set(false);
    }
    public void releaseOn(){
        release.set(true);
    }
    public void backOff(){
        back.set(false);
    }
    public void backOn(){
        back.set(true);
    }
}
