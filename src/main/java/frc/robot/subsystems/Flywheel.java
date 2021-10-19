// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Flywheel extends SubsystemBase {
  /** Creates a new Flywheel. */
  
  private final WPI_TalonSRX _flywheelTalon;

  public Flywheel() {
    _flywheelTalon = new WPI_TalonSRX(Constants.MotorPorts.FlywheelPort);
    _flywheelTalon.setInverted(false);

    _flywheelTalon.configFactoryDefault();

    _flywheelTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void controlFlywheel(double speed) {
    _flywheelTalon.set(speed);
  }

  public double getVelocity() {
    // divide by 4096 to get number of rotations and multiple by circumference to find distance traveled

    double val = _flywheelTalon.getSelectedSensorVelocity() / Constants.RobotVals.EncoderTicks 
                                                            * Constants.RobotVals.WheelCircumfernce;
    return val;
  }



}
