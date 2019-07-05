package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

@Component(value="sixCyl")
public class SixCylinderEngine implements Engine{

	public int numberOfCylinders()
	{
		return 6;
	}
	public String drive() {
		// TODO Auto-generated method stub
		return "Driving with 6 cylinders";
	}

}
