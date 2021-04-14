package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Chassis;



public class ChassisControl extends CommandBase {

    public Chassis commandChassis;




    public ChassisControl(Chassis chassis){
        commandChassis = chassis;
        addRequirements(commandChassis);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        double x = RobotContainer.mController.getX();
        double y = RobotContainer.mController.getY();
        commandChassis.runJoystick(x, y);
    }


}
