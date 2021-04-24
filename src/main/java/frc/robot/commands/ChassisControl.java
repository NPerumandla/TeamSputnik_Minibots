package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Chassis;




public class ChassisControl extends CommandBase {


    Chassis cChassis;

    public ChassisControl(Chassis chassis){

        cChassis = chassis;
        addRequirements(cChassis);




    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        double x = RobotContainer.mController.getRawAxis(1);
        double y = RobotContainer.mController.getRawAxis(4);
        cChassis.runJoystick(x, y);
    }


}
