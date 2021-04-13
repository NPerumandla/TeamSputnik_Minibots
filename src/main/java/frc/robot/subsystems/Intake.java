package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.IntakeControl;

public class Intake extends SubsystemBase {

    public WPI_TalonFX intakeMotor;



    // fix motor id
    public Intake(){
        intakeMotor = new WPI_TalonFX(2);
        intakeMotor.config_kP(0, 1.0);
        intakeMotor.config_kI(0,0);
        intakeMotor.config_kD(0,0);


        setDefaultCommand(new IntakeControl(new Intake()));
    }


    // fix the input
    public void runIntake() {
        intakeMotor.setSelectedSensorPosition(0);
    }

}
