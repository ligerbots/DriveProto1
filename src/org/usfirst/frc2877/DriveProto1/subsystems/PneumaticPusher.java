/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.subsystems;

import org.usfirst.frc2877.DriveProto1.RobotMap;
import org.usfirst.frc2877.DriveProto1.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Administrator
 */
public class PneumaticPusher extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    DoubleSolenoid pushSolenoid = RobotMap.pneumaticPusherPushSolenoid;
    Compressor pushCompressor = RobotMap.pneumaticPusherPushCompressor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void pushSet( boolean pushOut ) {
        if (pushOut == true) {
            pushSolenoid.set(DoubleSolenoid.Value.kForward);
        } else {
            pushSolenoid.set(DoubleSolenoid.Value.kReverse);
        }
    }
    public void pushOff() {
        pushSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}