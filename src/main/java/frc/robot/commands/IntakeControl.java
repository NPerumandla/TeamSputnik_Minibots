package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Intake;


public class IntakeControl extends InstantCommand {



    public Intake iIntake;

    public IntakeControl(Intake intake){

        iIntake = intake;
        addRequirements(iIntake);
    }

//    @Override
//    public void execute() {
//        iIntake.runIntake();
//    }
}
