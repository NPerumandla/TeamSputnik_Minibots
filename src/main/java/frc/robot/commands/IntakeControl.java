package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;




public class IntakeControl extends InstantCommand {




    public IntakeControl(){

        addRequirements(RobotContainer.intake);
    }

    @Override
    public void execute() {
        RobotContainer.intake.runIntake();
    }
}
