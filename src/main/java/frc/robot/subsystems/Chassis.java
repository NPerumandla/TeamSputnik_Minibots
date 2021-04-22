package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;





public class Chassis extends SubsystemBase {
    public WPI_TalonFX right_motor;
    public WPI_TalonFX left_motor;
    public DifferentialDrive differentialDrive;


    public Chassis(){
        right_motor = new WPI_TalonFX(Constants.RIGHT_CONTROLLER);
        left_motor = new WPI_TalonFX(Constants.LEFT_CONTROLLER);
        differentialDrive = new DifferentialDrive(right_motor, left_motor);
        right_motor.setNeutralMode(NeutralMode.Brake);
        left_motor.setNeutralMode(NeutralMode.Brake);

    }

    public void runJoystick(double x, double z){
        differentialDrive.curvatureDrive(x, z,true);


    }

}
