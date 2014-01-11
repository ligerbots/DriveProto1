/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2877.RobotMap;

/**
 *
 * @author 1640295
 */
public class EncoderTester extends Subsystem {
    Encoder quadratureEncoder1 = RobotMap.encoderTestingQuadratureEncoder1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void quadratureEncoder () {
        System.out.println(quadratureEncoder1.getDirection());
    }
    
}
