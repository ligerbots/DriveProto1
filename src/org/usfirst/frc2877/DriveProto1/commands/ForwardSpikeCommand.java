/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.commands;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2877.DriveProto1.Robot;

/**
 *
 * @author Administrator
 */
public class ForwardSpikeCommand extends Command {
    
    Relay.Value value;

    public ForwardSpikeCommand() {
    }
    public ForwardSpikeCommand(Relay.Value v) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.spikeSubsystem);
        value = v;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.spikeSubsystem.setSpike(value);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
