package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pbasu.simple.spel.xml.Fruit;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/simple/SpringAppConfig/springBeanAppContext.xml");
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Fruit fruitNoSPEL = appContext.getBean("fruitNoSPEL",Fruit.class);
		System.out.println(fruitNoSPEL.talkAboutYourself());
		
		Fruit fruitHardCodedSPEL = appContext.getBean("fruitHardCodedSPEL",Fruit.class);
		System.out.println(fruitHardCodedSPEL.talkAboutYourself());
		
		Fruit fruitFromDataSourceSPEL = appContext.getBean("fruitFromDataSourceSPEL",Fruit.class);
		System.out.println(fruitFromDataSourceSPEL.talkAboutYourself());
		
		Fruit fruitFromStaticDataSourceSPEL = appContext.getBean("fruitFromStaticDataSourceSPEL",Fruit.class);
		System.out.println(fruitFromStaticDataSourceSPEL.talkAboutYourself());
		
		Fruit fruitFromStaticDataSourceMultiplePropertySPEL = appContext.getBean("fruitFromStaticDataSourceMultiplePropertySPEL",Fruit.class);
		System.out.println(fruitFromStaticDataSourceMultiplePropertySPEL.talkAboutYourself());

		((ClassPathXmlApplicationContext)appContext).close();
	}

}
