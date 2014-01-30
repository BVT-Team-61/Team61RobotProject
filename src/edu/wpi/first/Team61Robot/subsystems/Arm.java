/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.ArmlevateWithJoysticks;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author bvths
 */
public class Arm extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private SpeedController armMotor = new Victor(RobotMap.armMotor);
    private Solenoid armapultIn = new Solenoid(RobotMap.armapultInSolenoid);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ArmlevateWithJoysticks());
    }
    public void armlevate(double vel) {
        armMotor.set(vel);
    }
    
    public void setIn(boolean on) {
        armapultIn.set(on);
    }
    
    public void doNothing() {
    }
}
