package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

@Component(value="sixCyl") //only @Component will cause bean to be referred as sixCylinderEngine
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
