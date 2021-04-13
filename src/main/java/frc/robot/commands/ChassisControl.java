package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;

import static frc.robot.Constants.mController;

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
        double x = mController.getX();
        double y = mController.getY();
        commandChassis.runJoystick(x, y);
    }


}
