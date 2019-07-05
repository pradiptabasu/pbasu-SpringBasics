package com.pbasu.simple.car.requiredAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Required;

public class Fruits {
	
	String description;
	
	public Fruits() {
	}

	public String getDescription() {
		return description;
	}

	@Required
	public void setDescription(String description) {
		this.description = description;
	}

	public String talkAboutYourself() {
		return description;
	}
	
	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("I am inside init method for Fruits class. Value for description at this time is " + description);
	}
	
	@PreDestroy
	public void myDestroyMethod()
	{
		System.out.println("I am inside destroy method for Fruits class");
	}
}
