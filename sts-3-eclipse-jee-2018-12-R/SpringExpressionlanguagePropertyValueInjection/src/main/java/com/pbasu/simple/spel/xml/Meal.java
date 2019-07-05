package com.pbasu.simple.spel.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Meal {
	
	@Value("#{fruit}")
	private Fruit fruit;

	@Value("#{fruit.name}")
	private String fruitName;
	
	@Value("#{fruit.returnNullFunction()?.toUpperCase() + ' is returned from Fruit'}")
	private String dummyDescription;
	
	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getDummyDescription() {
		return dummyDescription;
	}

	public void setDummyDescription(String dummyDescription) {
		this.dummyDescription = dummyDescription;
	}

	public String getDescription()
	{
		String desc = "";
		if(fruit != null)
		{
			desc += "This meal has some fruit ( " + fruit.getName() + " )\n";
		}
		return desc;
	}
}
