package com.pbasu.simple.car;

import org.springframework.stereotype.Component;

import com.pbasu.custom.annotation.AnotherRandomAnnotation;

//@Component(value="bigTire")
@AnotherRandomAnnotation
public class BigTire implements Tire{

	public String getTireDiameter() {
		// TODO Auto-generated method stub
		return "20 inch diameter";
	}

}
