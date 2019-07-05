package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogModule {
	@Before(value="execution(void com.demo.vehicles.Car.drive())")
	public void vehicleAboutToMove()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Before Drive");
	}
	
	@After(value="execution(void com.demo.vehicles.Car.drive())")
	public void vehicleHaveMoved()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : @After Drive");
	}
	
	@AfterReturning(value="execution(void com.demo.vehicles.Car.drive())")
	public void vehicleHaveMovedAfterReturning()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : @AfterReturning Drive");
	}
	
	@AfterThrowing(value="execution(void com.demo.vehicles.Car.drive())")
	public void vehicleHaveMovedAfterThrowing()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : @AfterThrowing Drive");
	}
	
	@Around(value="execution(void com.demo.vehicles.Car.drive())")
	public void vehicleHaveMovedAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : @Around Drive call");
		try {
			pjp.proceed();
		}
		catch(Exception e) {
			System.out.println("Caught Exception in Around advice : " + e);
		}
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : @Around Drive call");
	}
	
	@Before(value="execution(void com.demo.vehicles.Car.stop())")
	public void vehicleAboutToStop()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Before stop");
	}
	
	@After(value="execution(void com.demo.vehicles.Car.stop())")
	public void vehicleHaveStopped()
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : After stop");
	}
	
	@Around(value="execution(void com.demo.vehicles.Car.stop())")
	public void vehicleHaveStoppedAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Around stop before call");
		pjp.proceed();
		System.out.println("Saving to log from MyLogModule.class i.e. Aspect : Around stop after call");
	}
}
