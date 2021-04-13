package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Intake;



public class IntakeControl extends InstantCommand {

    public Intake commandIntake;


    public IntakeControl(Intake intake){
        commandIntake = intake;
        addRequirements(commandIntake);

    }

    @Override
    public void initialize() {
        if(RobotContainer.mController.getAButtonPressed()){
            commandIntake.runIntake();
        }
    }
}
