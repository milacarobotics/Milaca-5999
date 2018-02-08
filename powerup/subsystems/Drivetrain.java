// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5999.powerup.subsystems;

import org.usfirst.frc5999.powerup.RobotMap;
import org.usfirst.frc5999.powerup.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drivetrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController frontLeft = RobotMap.drivetrainfrontLeft;
    private final SpeedController rearleft = RobotMap.drivetrainrearleft;
    private final SpeedControllerGroup leftDrive = RobotMap.drivetrainleftDrive;
    private final SpeedController frontRight = RobotMap.drivetrainfrontRight;
    private final SpeedController rearRight = RobotMap.drivetrainrearRight;
    private final SpeedControllerGroup rightDrive = RobotMap.drivetrainrightDrive;
    private final DifferentialDrive differentialDrive = RobotMap.drivetrainDifferentialDrive;
    private final Ultrasonic frontUltrasonic = RobotMap.drivetrainfrontUltrasonic;
    private final Ultrasonic rearUltrasonic = RobotMap.drivetrainRearUltrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveRobot());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void driveMe(Joystick joystickLeft, Joystick joystickRight) {
    	// Do magic stuff here.
    }

}
