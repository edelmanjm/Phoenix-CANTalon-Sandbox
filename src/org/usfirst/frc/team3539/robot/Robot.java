/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3539.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

	CANTalon _talonSRX = new CANTalon(0);
	
	public void robotInit() {
	}
	
	public void teleopPeriodic() {
	}

	public void testPeriodic() {
	}
}
