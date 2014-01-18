/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2877.DriveProto1.Robot;

/**
 *
 * @author Administrator
 */
public class PneumaticPush extends Command {
    
private int iteration = 0;
private int maxPushout = 50;
    public PneumaticPush() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.pneumaticPusher);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        iteration = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        iteration += 1;
        
        if (iteration < maxPushout) {
        Robot.pneumaticPusher.pushSet(true);
        } else { Robot.pneumaticPusher.pushSet(false);
        
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        boolean finished = false;
        if (iteration > 2*maxPushout) {
            finished = true;
        }
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.pneumaticPusher.pushOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
