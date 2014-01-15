/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2877.DriveProto1.RobotMap;

/**
 *
 * @author shivroychowdhury
 */
public class EncoderMotor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    CANJaguar cANJaguar = RobotMap.encoderTesterJaguar;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void runMotor(double run) {
        try {
            cANJaguar.setX(run);
        } catch (edu.wpi.first.wpilibj.can.CANTimeoutException ex) {
            System.out.println("Timeout Exception on ");
        }
    }
}
