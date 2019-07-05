package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pbasu.simple.spel.xml.Fruit;
import com.pbasu.simple.spel.xml.Meal;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/simple/SpringAppConfig/springBeanAppContext.xml");

		Meal meal = appContext.getBean("meal", Meal.class);
		System.out.println("meal ------>>>>>> "+ meal.getDescription());
		System.out.println("meal ------>>>>>> "+ meal.getFruitName());
		System.out.println("meal ------>>>>>> "+ meal.getDummyDescription());

		((ClassPathXmlApplicationContext)appContext).close();
	}

}
