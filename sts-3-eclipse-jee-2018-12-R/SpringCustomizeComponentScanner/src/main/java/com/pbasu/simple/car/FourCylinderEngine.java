package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

@Component(value="fourCyl")
public class FourCylinderEngine implements Engine{

	public int numberOfCylinders()
	{
		return 4;
	}
	public String drive() {
		// TODO Auto-generated method stub
		return "Driving with 4 cylinders";
	}

}
