package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

import com.pbasu.custom.annotation.RandomAnnotation;

//@Component(value="smallTire")
@RandomAnnotation
public class SmallTire implements Tire{

	public String getTireDiameter() {
		// TODO Auto-generated method stub
		return "14 inch diameter";
	}

}
