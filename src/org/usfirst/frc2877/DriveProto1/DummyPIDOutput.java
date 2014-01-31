/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc2877.DriveProto1;
import edu.wpi.first.wpilibj.PIDOutput;

/** 
 * A dummy PID output that does not output to any hardware.
 * Pass the DummyPIDOutput object to the PIDController class
 * and read the output in your own code. This is useful for
 * mixing the results of multiple PID controllers to one
 * output.
 *
 * @author Joe Ross, Team 330
 */
public class DummyPIDOutput implements PIDOutput{
    public double output;
    
    public DummyPIDOutput()
    {
        output = 0;
    }

    public void pidWrite(double output) {
        this.output = output;
    }

    public double getOutput() {
        return output;
    }
    
}
