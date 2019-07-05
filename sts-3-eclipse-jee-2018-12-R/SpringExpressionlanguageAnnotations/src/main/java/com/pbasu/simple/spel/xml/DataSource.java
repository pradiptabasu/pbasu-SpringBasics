package com.pbasu.simple.spel.xml;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component("demoDataSource")
public class DataSource {
	
	public String appleDescription = "I am apple description. ";
	
	public String getAppleType()
	{
		ArrayList<String> types = new ArrayList<String>();
		types.add("Simla");
		types.add("America");
		types.add("Darjeeling");
		types.add("Pinata");
		types.add("honeyCrisp");
		
		int index = new Random().nextInt(types.size());
		String type = types.get(index);
		return type;
	}
	
	public static String getAppleTypeStatic()
	{
		ArrayList<String> types = new ArrayList<String>();
		types.add("Simla");
		types.add("America");
		types.add("Darjeeling");
		types.add("Pinata");
		types.add("honeyCrisp");
		
		int index = new Random().nextInt(types.size());
		String type = types.get(index);
		return type;
	}

}
