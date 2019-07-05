package com.pbasu.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruits f = new Fruits();
		//Vegetable v = new Vegetable();
		
		//below line if Bean definition files are at same level as pom.xml i.e. @ D:\Workspace\sts-3-eclipse-jee-2018-12-R\HelloWorldSpring1
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("springBeanAppContext.xml");
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/pbasu/configFiles/springBeanAppContext.xml");
		
		Fruits f = appContext.getBean("fruit", Fruits.class);
		Vegetable v = appContext.getBean("vegetable", Vegetable.class);
		
		System.out.println(f.talkAboutYourself());
		System.out.println(v.talkAboutYourself());
		
		Fruits wthNamef = appContext.getBean("fruitWithName", Fruits.class);
		System.out.println(wthNamef.talkAboutYourself());
		
		Vegetable wthNamev = appContext.getBean("vegetableWithName", Vegetable.class);
		System.out.println(wthNamev.talkAboutYourself());
		
		Fruits wthListf = appContext.getBean("fruitWithList", Fruits.class);
		System.out.println(wthListf.talkAboutYourself());
		
		Fruits wthMapf = appContext.getBean("fruitWithMap", Fruits.class);
		System.out.println(wthMapf.talkAboutYourself());
		
		Fruits wthListAndMapf = appContext.getBean("fruitWithListAndMap", Fruits.class);
		System.out.println(wthListAndMapf.talkAboutYourself());
		
		Vegetable wthPnamespacev = appContext.getBean("vegetableUsingPnamespace", Vegetable.class);
		System.out.println(wthPnamespacev.talkAboutYourself());
		
		Meal meal = appContext.getBean("meal", Meal.class);
		System.out.println(meal.talkAboutMeal());
		
		Meal mealWithConstructorInjection = appContext.getBean("mealWithConstructorInjection", Meal.class);
		System.out.println(mealWithConstructorInjection.talkAboutMeal());
		
		Meal mealWithConstructorInjectionByName = appContext.getBean("mealWithConstructorInjectionByName", Meal.class);
		System.out.println(mealWithConstructorInjectionByName.talkAboutMeal());
		
		SeaFood seaFood = appContext.getBean("seaFood", SeaFood.class);
		System.out.println(seaFood.talkAboutYourself());
		
		SeaFood seaFoodExternalProperty = appContext.getBean("seaFoodExternalProperty", SeaFood.class);
		System.out.println(seaFoodExternalProperty.talkAboutYourself());
		
		Meal mealWithInnerOuterBean = appContext.getBean("mealWithInnerOuterBean", Meal.class);
		System.out.println(mealWithInnerOuterBean.talkAboutMealInDetails());
		
		//((FileSystemXmlApplicationContext) appContext).close();
		((ClassPathXmlApplicationContext) appContext).close();
	}
}
