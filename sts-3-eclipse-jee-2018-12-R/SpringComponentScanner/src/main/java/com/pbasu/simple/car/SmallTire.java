package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

@Component(value="smallTire")
public class SmallTire implements Tire{

	public String getTireDiameter() {
		// TODO Auto-generated method stub
		return "14 inch diameter";
	}

}
