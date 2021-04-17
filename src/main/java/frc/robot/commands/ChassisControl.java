package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Chassis;

import static frc.robot.RobotContainer.mChassis;


public class ChassisControl extends CommandBase {


    Chassis cChassis;

    public ChassisControl(Chassis chassis){

        cChassis = chassis;
        addRequirements(cChassis);

        addRequirements(mChassis);

    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        double x = RobotContainer.mController.getX();
        double y = RobotContainer.mController.getY();
        mChassis.runJoystick(x, y);
    }


}
