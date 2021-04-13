package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.ChassisControl;




public class Chassis extends SubsystemBase {
    public WPI_TalonFX right_motor;
    public WPI_TalonFX left_motor;
    public DifferentialDrive differentialDrive;


    public Chassis(){
        right_motor = new WPI_TalonFX(0);
        left_motor = new WPI_TalonFX(1);
        differentialDrive = new DifferentialDrive(left_motor, right_motor);


        setDefaultCommand(new ChassisControl(new Chassis()));
    }

    public void runJoystick(double x, double z){
        differentialDrive.arcadeDrive(x, z);


    }

}
