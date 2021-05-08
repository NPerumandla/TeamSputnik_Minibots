// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ChassisControl;
import frc.robot.subsystems.Chassis;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
//  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
//
//  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  public static Chassis mChassis = new Chassis();
  public static XboxController mController = new XboxController(Constants.CONTROLLER);



  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings

    configureButtonBindings();


    mChassis.setDefaultCommand(new ChassisControl(mChassis));
//    intake.setDefaultCommand(new IntakeControl(intake));

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {





  }

  //  public ArrayList<Command> getAutonomousCommand() {
//    // An ExampleCommand will run in autonomous
//
//    ArrayList<Command> autonCommand = new ArrayList<>();
//
//
//
//    return autonCommand;
//  }
}
