/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2877.DriveProto1.Robot;
//import org.usfirst.frc2877.DriveProto1.subsystems.SpikeSubsystem;

/**
 *
 * @author Administrator
 */
public class SpikeCommand extends Command {
    
    private int iteration = 0;
    
    public SpikeCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.spikeSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.spikeSubsystem.runSpike(false);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        iteration += 1;
        if (iteration < 1500) {
            System.out.println("Running spike iteration = " + iteration);
        Robot.spikeSubsystem.runSpike(true);
        } else {
        Robot.spikeSubsystem.runSpike(false);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.spikeSubsystem.runSpike(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
