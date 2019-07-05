package com.pbasu.simple.spel.xml;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getNutrition() {
		return nutrition;
	}

	public void setNutrition(int nutrition) {
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
