package com.pbasu.simple.car.InjectAnnotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.pbasu.simple.car.Engine;
import com.pbasu.simple.car.Tire;

public class WeekendCar {
	//@Autowired
	//@Qualifier("sTire")
	@Inject
	@Named("smallTire")
	private Tire frontLeft;
	
	//@Autowired
	//@Qualifier("sTire")
	@Inject
	@Named("smallTire")
	private Tire frontRight;
	
	//@Autowired
	//@Qualifier("bTire")
	@Inject
	@Named("bigTire")
	private Tire rearLeft;
	
	//@Autowired
	//@Qualifier("bTire")
	@Inject
	@Named("bigTire")
	private Tire rearRight;
	
	//@Autowired
	//@Qualifier("sixCylinider")
	@Inject
	@Named("sixCyl")
	private Engine engineType;

	public WeekendCar()
	{
	}
	
	public WeekendCar(Tire frontLeft, Tire frontRight, Tire rearLeft, Tire rearRight, Engine engineType) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.engineType = engineType;
	}

	public Tire getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(Tire frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Tire getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(Tire frontRight) {
		this.frontRight = frontRight;
	}

	public Tire getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(Tire rearLeft) {
		this.rearLeft = rearLeft;
	}

	public Tire getRearRight() {
		return rearRight;
	}

	public void setRearRight(Tire rearRight) {
		this.rearRight = rearRight;
	}

	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}
	
	public String getCarDescription()
	{
		String description="";
		
		if(frontLeft != null)
		{
			description += "\n\tFront Left Tire: " + frontLeft.getTireDiameter();
		}
		if(frontRight != null)
		{
			description += "\n\tFront Right Tire: " + frontRight.getTireDiameter();
		}
		if(rearLeft != null)
		{
			description += "\n\tRear Left Tire: " + rearLeft.getTireDiameter();
		}
		if(rearRight != null)
		{
			description += "\n\tRear Right Tire: " + rearRight.getTireDiameter();
		}
		if(engineType != null)
		{
			description += "\n\tEngine: " + engineType.drive();
		}
		if(description.equalsIgnoreCase(""))
		{
			description = "Not Set";
		}
		
		return description;
	}
}
