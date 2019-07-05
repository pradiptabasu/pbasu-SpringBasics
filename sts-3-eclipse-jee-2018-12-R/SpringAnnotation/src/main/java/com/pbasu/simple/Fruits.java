package com.pbasu.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fruits {
	
	String description = "Hello I am a Fruit.";
	
	public Fruits() {
	}

	public String getDescription() {
		return description;
	}

	@Autowired
	public void setDescription(@Value("Value set from @Value annotation") String description) {
		this.description = description;
	}

	public String talkAboutYourself() {
		return description;
	}
}
