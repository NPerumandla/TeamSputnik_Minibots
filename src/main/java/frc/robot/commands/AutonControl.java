package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.*;
import frc.robot.auton.AutonDrive;
import frc.robot.subsystems.Chassis;


import java.util.function.BooleanSupplier;

public class AutonControl extends SequentialCommandGroup {

   public Chassis mChassis;

    public AutonControl(Chassis chassis){

        mChassis = chassis;
        addRequirements(mChassis);

    }


    @Override
    public void initialize() {
        addCommands(new AutonDrive(-.5,.25,1,mChassis));
        addCommands(new AutonDrive(0,0,1,mChassis));
        addCommands(new AutonDrive(.5,-.25,1,mChassis));
        addCommands(new AutonDrive(0,0,1,mChassis));
        addCommands(new AutonDrive(-.7,0,1,mChassis));
        super.initialize();
    }
}
