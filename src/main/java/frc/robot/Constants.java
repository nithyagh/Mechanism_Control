// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class MotorPorts {
        public static final int FlywheelPort = 14;
    }

    public static final class JoystickAxis {
        public static final int YAxis = 1;
    }

    public static final class RobotVals {
        // in meters
        public static final double WheelRadius = 0.0635;
        public static final double WheelCircumfernce = WheelRadius * 2 * Math.PI;
        public static final double EncoderTicks = 4096.0;
    }
}
