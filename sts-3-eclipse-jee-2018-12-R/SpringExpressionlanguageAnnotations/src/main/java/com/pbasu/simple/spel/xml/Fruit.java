package com.pbasu.simple.spel.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fruit")
public class Fruit {
	
	private String name;
	private int nutrition;
	
	public Fruit()
	{
	}
	
	public Fruit(String name, int nutrition) {
		this.name = name;
		this.nutrition = nutrition;
	}

	public String getName() {
		return name;
	}

	@Autowired
	//public void setName(@Value("#{'Shimla' + 'type apple'}")String name) 
	//public void setName(@Value("#{demoDataSource.getAppleType() + ' type apple'}")String name)
	public void setName(@Value("#{T(com.pbasu.simple.spel.xml.DataSource).getAppleTypeStatic() + ' type apple'}")String name)
	{
		this.name = name;
	}

	public int getNutrition() {
		return nutrition;
	}

	@Autowired
	public void setNutrition(@Value("#{T(java.lang.Math).random() * 10 + demoDataSource.getAppleType().length()}")int nutrition) {
		this.nutrition = nutrition;
	}
	
	public String talkAboutYourself()
	{
		String desc="I am a fruit. ";
		
		if(this.name != null)
		{
			desc += "My name is " + getName(); 
		}
		
		if(this.nutrition > 0)
		{
			desc += "My nutrition rating is " + getNutrition();
		}
		
		return desc;
	}

}
