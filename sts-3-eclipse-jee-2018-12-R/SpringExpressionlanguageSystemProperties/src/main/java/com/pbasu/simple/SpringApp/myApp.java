package com.pbasu.simple.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pbasu.simple.spel.xml.ScriptLoaderDemoClass;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/simple/SpringAppConfig/springBeanAppContext.xml");

		ScriptLoaderDemoClass scriptLoader = appContext.getBean("scriptLoaderDemoClass", ScriptLoaderDemoClass.class);
		scriptLoader.loadScript();

		((ClassPathXmlApplicationContext)appContext).close();
	}

}
