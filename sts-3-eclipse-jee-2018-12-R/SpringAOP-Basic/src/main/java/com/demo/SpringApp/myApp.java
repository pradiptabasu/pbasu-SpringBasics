package com.demo.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.vehicles.Car;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/demo/SpringAppConfig/springBeanAppContext.xml");
		
//		FamilyCar familyCar = appContext.getBean("familyCar", FamilyCar.class);
//		System.out.println("familyCar ---->>>>>> \n\t" + familyCar.getCarDescription());
		
		Car car = appContext.getBean("car", Car.class);
		car.drive();
		car.stop();
		
				
		((ClassPathXmlApplicationContext)appContext).close();
	}

}

