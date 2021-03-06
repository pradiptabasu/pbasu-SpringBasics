package com.pbasu.simple.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FamilyCar {
	
	@Autowired
	@Qualifier("sTire")
	private Tire frontLeft;
	
	@Autowired
	@Qualifier("sTire")
	private Tire frontRight;
	
	@Autowired
	@Qualifier("bTire")
	private Tire rearLeft;
	
	@Autowired
	@Qualifier("bTire")
	private Tire rearRight;
	
	@Autowired
	@Qualifier("fourCylinider")
	private Engine engineType;

	public FamilyCar()
	{
	}
	
	public FamilyCar(Tire frontLeft, Tire frontRight, Tire rearLeft, Tire rearRight, Engine engineType) {
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
