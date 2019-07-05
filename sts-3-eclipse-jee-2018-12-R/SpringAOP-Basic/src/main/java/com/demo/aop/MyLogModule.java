package com.demo.aop;

public class MyLogModule {
	public void vehicleAboutToMove()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car is driving");
	}
	public void vehicleAboutToMove2()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car should be driving");
	}
	public void vehicleHaveMoved()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car already started driving");
	}
}
