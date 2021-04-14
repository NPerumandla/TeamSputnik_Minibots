package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.IntakeControl;

public class Intake extends SubsystemBase {

    public WPI_TalonFX intakeMotor;




    // fix motor id
    public Intake(){
        intakeMotor = new WPI_TalonFX(Constants.INTAKE_MOTOR);

        intakeMotor.config_kP(0, 1.0);
        intakeMotor.config_kI(0,0);
        intakeMotor.config_kD(0,0);



    }


    // fix the input
    public Command runIntake() {
        intakeMotor.setSelectedSensorPosition(0);
        return null;
    }



}
