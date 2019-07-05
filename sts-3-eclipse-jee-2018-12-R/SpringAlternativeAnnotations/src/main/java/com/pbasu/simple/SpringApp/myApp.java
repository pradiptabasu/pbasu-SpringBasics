package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/simple/SpringAppConfig/springBeanAppContext.xml");
		
//		FamilyCar familyCar = appContext.getBean("familyCar", FamilyCar.class);
//		System.out.println("familyCar ---->>>>>> \n\t" + familyCar.getCarDescription());
		
		com.pbasu.simple.car.ResourceAnnotation.FamilyCar altFamilyCarUsingResource = appContext.getBean("altFamilyCarUsingResource", com.pbasu.simple.car.ResourceAnnotation.FamilyCar.class);
		System.out.println("altFamilyCarUsingResource ---->>>>>>" + altFamilyCarUsingResource.getCarDescription());
		
		com.pbasu.simple.car.ResourceAnnotation.WeekendCar altWeekendCarUsingResource = appContext.getBean("altWeekendCarUsingResource", com.pbasu.simple.car.ResourceAnnotation.WeekendCar.class);
		System.out.println("altWeekendCarUsingResource ---->>>>>>" + altWeekendCarUsingResource.getCarDescription());
		
		com.pbasu.simple.car.InjectAnnotation.FamilyCar altFamilyCarUsingInject = appContext.getBean("altFamilyCarUsingInject", com.pbasu.simple.car.InjectAnnotation.FamilyCar.class);
		System.out.println("altFamilyCarUsingInject ---->>>>>>" + altFamilyCarUsingInject.getCarDescription());
		
		com.pbasu.simple.car.InjectAnnotation.WeekendCar altWeekendCarUsingInject = appContext.getBean("altWeekendCarUsingInject", com.pbasu.simple.car.InjectAnnotation.WeekendCar.class);
		System.out.println("altWeekendCarUsingInject ---->>>>>>" + altWeekendCarUsingInject.getCarDescription());
				
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
