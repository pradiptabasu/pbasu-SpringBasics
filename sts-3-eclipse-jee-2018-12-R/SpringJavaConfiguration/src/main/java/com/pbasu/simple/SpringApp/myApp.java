package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pbasu.simple.car.FamilyCar;
import com.pbasu.simple.car.FourCylinderEngine;
import com.pbasu.simple.car.SixCylinderEngine;
import com.pbasu.simple.car.WeekendCar;
import com.pbasu.simple.javaConfig.AppConfig;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*
		 * Not usable as implicit bean registration is in use
		 * 
		 * FamilyCar altFamilyCar = appContext.getBean("altFamilyCar", FamilyCar.class);
		 * System.out.println("altFamilyCar ---->>>>>>" +
		 * altFamilyCar.getCarDescription());
		 * 
		 * WeekendCar altWeekendCar = appContext.getBean("altWeekendCar",
		 * WeekendCar.class); System.out.println("altWeekendCar ---->>>>>>" +
		 * altWeekendCar.getCarDescription());
		 */
		
		FamilyCar altAutoWiredFamilyCar = appContext.getBean("altAutoWiredFamilyCar", FamilyCar.class);
		System.out.println("altAutoWiredFamilyCarUsingQualifier ---->>>>>>" + altAutoWiredFamilyCar.getCarDescription());
		
		WeekendCar altWeekendCarAutoWired = appContext.getBean("altWeekendCarAutoWired", WeekendCar.class);
		System.out.println("altWeekendCarAutoWiredUsingInjection ---->>>>>>" + altWeekendCarAutoWired.getCarDescription());
		
				
		((AnnotationConfigApplicationContext)appContext).close();
	}

}
