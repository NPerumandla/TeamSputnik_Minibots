package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Door;

public class DoorControl extends InstantCommand {


    public Door dDoor;

    public DoorControl(Door door){

        dDoor = door;
        addRequirements(dDoor);
    }

    @Override
    public void execute(){

        RobotContainer.door.openDoor();

    }


}
