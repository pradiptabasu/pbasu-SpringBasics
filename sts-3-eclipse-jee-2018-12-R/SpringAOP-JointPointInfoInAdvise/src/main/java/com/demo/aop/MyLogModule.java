package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogModule {
	@Before(value="execution(void com.demo.vehicles.Car.drive(..))")
	public void vehicleAboutToMove()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car is driving");
	}
	@Before(value="execution(void com.demo.vehicles.Car.drive(..))")
	public void vehicleAboutToMove2(JoinPoint jp) throws Exception
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car should be driving");
		System.out.println("Joint point Kind  :  " + jp.getKind());
		System.out.println("Joint point Static Part  :  " + jp.getStaticPart());

		Object args[] = jp.getArgs();
		int speed = ((Integer)args[0]).intValue();
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car is driving with speed " + speed);
		
		System.out.println("Joint point Target  :  " + jp.getTarget());
		
		if(speed > 150)
			throw new Exception();
	}
	
	@After(value="execution(void com.demo.vehicles.Car.drive())")
	public void vehicleHaveMoved()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car should be alread driving");
	}
	
	@Before(value="execution(void com.demo.vehicles.Car.stop())")
	public void vehicleAboutToStop()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car is going to stop");
	}
	
	@After(value="execution(void com.demo.vehicles.Car.stop())")
	public void vehicleHaveStopped()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Car should have stopped");
	}
}
