package frc.robot.auton;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Chassis;



public class AutonDrive extends CommandBase {

    private double driveSpeed;
    private double rotationSpeed;
    private double time;
    private Chassis cChassis;

    Timer mTimer;

    public AutonDrive(double speed, double rotate, double amtTime, Chassis chassis){

        cChassis = chassis;
        addRequirements(cChassis);

        mTimer = new Timer();

        driveSpeed = speed;
        rotationSpeed = rotate;
        time = amtTime;

    }

    @Override
    public void initialize() {

        mTimer.reset();
        mTimer.start();
    }

    @Override
    public void execute() {
        RobotContainer.mChassis.runJoystick(driveSpeed,rotationSpeed);

    }

    @Override
    public boolean isFinished() {
        return (mTimer.get() >= time);
    }
}
