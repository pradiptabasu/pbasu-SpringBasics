package com.pbasu.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//below line if Bean definition files are at same level as pom.xml i.e. @ D:\Workspace\sts-3-eclipse-jee-2018-12-R\HelloWorldSpring1
		ApplicationContext appContext = new FileSystemXmlApplicationContext("springBeanAppContext.xml");
		
		Meal mealByAnnotation = appContext.getBean("mealByAnnotation", Meal.class);
		System.out.println("mealByAnnotation ---->>>>>> \n\t" + mealByAnnotation.talkAboutMeal());
		
		Meal mealByAnnotationAutowireConstructor = appContext.getBean("mealByAnnotationAutowireConstructor", Meal.class);
		System.out.println("mealByAnnotationAutowireConstructor ---->>>>>> \n\t" + mealByAnnotationAutowireConstructor.talkAboutMeal());
		
		Fruits fruitValueFromXml = appContext.getBean("fruitValueFromXml", Fruits.class);
		System.out.println("fruitValueFromXml ---->>>>>> \n\t" + fruitValueFromXml.talkAboutYourself());
		
		Fruits fruitValueFromValueAnnotation = appContext.getBean("fruitValueFromValueAnnotation", Fruits.class);
		System.out.println("fruitValueFromValueAnnotation ---->>>>>> \n\t" + fruitValueFromValueAnnotation.talkAboutYourself());
		
		((FileSystemXmlApplicationContext) appContext).close();
	}
}
