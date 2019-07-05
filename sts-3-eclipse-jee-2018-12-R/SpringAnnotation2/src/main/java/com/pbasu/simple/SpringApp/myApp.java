package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pbasu.simple.car.FamilyCar;
import com.pbasu.simple.car.WeekendCar;
import com.pbasu.simple.car.requiredAnnotation.Fruits;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/simple/SpringAppConfig/springBeanAppContext.xml");
		
//		FamilyCar familyCar = appContext.getBean("familyCar", FamilyCar.class);
//		System.out.println("familyCar ---->>>>>> \n\t" + familyCar.getCarDescription());
		
		FamilyCar altFamilyCar = appContext.getBean("altFamilyCar", FamilyCar.class);
		System.out.println("altFamilyCar ---->>>>>>" + altFamilyCar.getCarDescription());
		
		WeekendCar altWeekendCar = appContext.getBean("altWeekendCar", WeekendCar.class);
		System.out.println("altWeekendCar ---->>>>>>" + altWeekendCar.getCarDescription());
		
		Fruits requiredDescriptionFruit = appContext.getBean("requiredDescriptionFruit", Fruits.class);
		System.out.println("requiredDescriptionFruit ---->>>>>> \n\t" + requiredDescriptionFruit.talkAboutYourself());
				
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
