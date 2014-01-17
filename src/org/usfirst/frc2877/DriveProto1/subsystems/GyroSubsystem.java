/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc2877.DriveProto1.RobotMap;
import org.usfirst.frc2877.DriveProto1.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.ADXL345_I2C;

import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 * @author Administrator
 */
public class GyroSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Gyro gyro1 = RobotMap.gyroSubsystemGyro1;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GyroReadCommand());
    }

public double getCurrentAngle(){
        double angle = gyro1.getAngle();
         return angle;
    }
}