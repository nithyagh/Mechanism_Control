// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Flywheel;

public class Launch extends CommandBase {
  /** Creates a new Launch. */

  private Flywheel _flywheel;
  private Joystick _joystick;

  public Launch(Flywheel fl, Joystick js) {
    // Use addRequirements() here to declare subsystem dependencies.
    _flywheel = fl;
    _joystick = js;

    addRequirements(_flywheel);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    _flywheel.controlFlywheel(_joystick.getRawAxis(Constants.JoystickAxis.YAxis));

    SmartDashboard.putNumber("Velocity: ", _flywheel.getVelocity());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
