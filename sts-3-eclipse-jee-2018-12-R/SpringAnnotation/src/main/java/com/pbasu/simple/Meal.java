package com.pbasu.simple;

import org.springframework.beans.factory.annotation.Autowired;

public class Meal {

	@Autowired
	private Fruits fruit;
	@Autowired(required=false) //since constructor autowiring is also present, required=false added at two placed to avoid exception
	private Vegetable vegetable;
//	@Autowired
	private Meat meat;
	@Autowired
	private Dairy dairy;
//	@Autowired
	private Grains grain;

	public Meal()
	{
		
	}
	
	@Autowired(required=false)
	public Meal(Fruits fruit, Vegetable vegetable, Meat meat, Dairy dairy, Grains grain) {
		super();
		this.fruit = fruit;
		this.vegetable = vegetable;
		this.meat = meat;
		this.dairy = dairy;
		this.grain = grain;
	}

	public Fruits getFruit() {
		return fruit;
	}

	public void setFruit(Fruits fruit) {
		this.fruit = fruit;
	}

	public Vegetable getVegetable() {
		return vegetable;
	}

	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public Grains getGrain() {
		return grain;
	}

	@Autowired
	public void setGrain(Grains grain) {
		this.grain = grain;
	}

	public String talkAboutMeal() {
		String answer = "";
		if (fruit != null)
			answer += "some fruit: ";
		if (vegetable != null)
			answer += "some vegetable: ";
		if (meat != null)
			answer += "some meat: ";
		if (dairy != null)
			answer += "some dairy: ";
		if (grain != null)
			answer += "some grain: ";
		return answer;
	}
	
	public String talkAboutMealInDetails() {
		String answer = "Meal details are as follows:";
		if (fruit != null)
			answer +=  "\n" + fruit.talkAboutYourself();
		if (vegetable != null)
			answer +=  "\n" + vegetable.talkAboutYourself();
		if (meat != null)
			answer += "\n" + meat.talkAboutYourself();
		if (dairy != null)
			answer += "\n" + dairy.talkAboutYourself();
		if (grain != null)
			answer += "\n" + grain.talkAboutYourself();
		return answer;
	}
}
