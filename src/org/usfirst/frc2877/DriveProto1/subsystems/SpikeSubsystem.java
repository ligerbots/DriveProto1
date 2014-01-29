/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2877.DriveProto1.RobotMap;

/**
 *
 * @author Administrator
 */
public class SpikeSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void runSpike(boolean onoff) {
        if (onoff == true) {
            RobotMap.spike1.set(Relay.Value.kReverse);
            System.out.println("Spike run");
        } else {
            RobotMap.spike1.set(Relay.Value.kOff);
        }
    }
    
    public void setSpike(Relay.Value value) {
        System.out.println("Setting Spike to " + value);
        RobotMap.spike1.set(value);
    }
}
