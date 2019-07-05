package com.demo.vehicles;

public class Car {
	public void drive() throws Exception
	{
		//below line is a tracing log which can be moved to a aspect
		//System.out.println("Saving to log from Car.class : Car is driving");
		
		//below line is actual business logic
		System.out.println("Car is Driving");
		throw new Exception();
	}
	public void stop()
	{
		System.out.println("Braking to stop");
	}
}
