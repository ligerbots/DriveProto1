/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2877.DriveProto1.RobotMap;
import org.usfirst.frc2877.DriveProto1.commands.ToggleServoCommand;

/**
 *
 * @author Administrator
 */
public class ServoSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Servo servo = RobotMap.servo1;
    boolean yup = true;
    public ServoSubsystem() {
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ToggleServoCommand());
    }
    
    public void switchServo() {
        if (yup) {
            servo.setAngle(90);
        } else { //nope
            servo.setAngle(0);
        }
        yup = !yup;
    }
    
}
