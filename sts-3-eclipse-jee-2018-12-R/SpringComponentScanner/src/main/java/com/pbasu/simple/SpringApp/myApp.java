package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pbasu.simple.car.FamilyCar;
import com.pbasu.simple.car.WeekendCar;


public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/simple/SpringAppConfig/springBeanAppContext.xml");
		
//		FamilyCar familyCar = appContext.getBean("familyCar", FamilyCar.class);
//		System.out.println("familyCar ---->>>>>> \n\t" + familyCar.getCarDescription());
		
		FamilyCar altFamilyCar = appContext.getBean("familyCar", FamilyCar.class);
		System.out.println("altFamilyCar ---->>>>>>" + altFamilyCar.getCarDescription());
		
		WeekendCar altWeekendCar = appContext.getBean("weekendCar", WeekendCar.class);
		System.out.println("altWeekendCar ---->>>>>>" + altWeekendCar.getCarDescription());
				
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
