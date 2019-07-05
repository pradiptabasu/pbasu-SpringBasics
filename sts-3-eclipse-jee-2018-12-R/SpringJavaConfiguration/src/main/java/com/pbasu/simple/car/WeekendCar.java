package com.pbasu.simple.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WeekendCar {
	
	private Engine engineType;

	public WeekendCar()
	{
	}
	
	public WeekendCar(Engine engineType) {
		this.engineType = engineType;
	}

	public Engine getEngineType() {
		return engineType;
	}

	@Autowired
	@Qualifier("sixCyl")
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}
	
	public String getCarDescription()
	{
		String description="";
		
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
