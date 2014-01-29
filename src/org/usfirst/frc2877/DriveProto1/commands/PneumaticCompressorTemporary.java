/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.DriveProto1.commands;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2877.DriveProto1.Robot;
import org.usfirst.frc2877.DriveProto1.RobotMap;

/**
 *
 * @author Administrator
 */
public class PneumaticCompressorTemporary extends Command {
    
    int time;
    private int timeOn = 0;
    
    public PneumaticCompressorTemporary(int t) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.pneumaticPusher);
        time = t;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        timeOn = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        timeOn += 1;
        
        if (timeOn < 25*time) {
            RobotMap.pneumaticPusherPushCompressor.start();
        } else {
            RobotMap.pneumaticPusherPushCompressor.stop();
        }
        /*
        System.out.print(timeOn);
        System.out.print("/");
        System.out.println(time*25);
        */
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        boolean isDone = false;
        if (timeOn > 25*time) {
            isDone = true;
        }
        return isDone;
        }

    // Called once after isFinished returns true
    protected void end() {
        RobotMap.pneumaticPusherPushCompressor.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
