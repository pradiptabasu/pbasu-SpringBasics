package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

@Component(value="bigTire")
public class BigTire implements Tire{

	public String getTireDiameter() {
		// TODO Auto-generated method stub
		return "20 inch diameter";
	}

}
