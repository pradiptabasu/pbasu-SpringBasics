package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

@Component("fourCyl") //can also be used as @Component(value="sixCyl"). Refer SixCylinderEngine class for details
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
