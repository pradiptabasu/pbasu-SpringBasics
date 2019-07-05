package com.pbasu.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//below line if Bean definition files are at same level as pom.xml i.e. @ D:\Workspace\sts-3-eclipse-jee-2018-12-R\HelloWorldSpring1
		ApplicationContext appContext = new FileSystemXmlApplicationContext("springBeanAppContext.xml");
		
		Meal meal = appContext.getBean("meal", Meal.class);
		System.out.println("meal ---->>>>>> \n\t" + meal.talkAboutMeal());
		
		Meal mealAutoWiredByType = appContext.getBean("mealAutoWiredByType", Meal.class);
		System.out.println("mealAutoWiredByType ---->>>>>> \n\t" + mealAutoWiredByType.talkAboutMeal());	
		
		Meal mealAutoWiredByName = appContext.getBean("mealAutoWiredByName", Meal.class);
		System.out.println("mealAutoWiredByName ---->>>>>> \n\t" + mealAutoWiredByName.talkAboutMeal());	
		
		Meal mealAutoWiredByConstructor = appContext.getBean("mealAutoWiredByConstructor", Meal.class);
		System.out.println("mealAutoWiredByConstructor ---->>>>>> \n\t" + mealAutoWiredByConstructor.talkAboutMeal());	
		
		Meal mealAutoWiredUsingDefaultAutoWiringMode = appContext.getBean("mealAutoWiredUsingDefaultAutoWiringMode", Meal.class);
		System.out.println("mealAutoWiredUsingDefaultAutoWiringMode ---->>>>>> \n\t" + mealAutoWiredUsingDefaultAutoWiringMode.talkAboutMeal());	
		
		((FileSystemXmlApplicationContext) appContext).close();
	}
}
