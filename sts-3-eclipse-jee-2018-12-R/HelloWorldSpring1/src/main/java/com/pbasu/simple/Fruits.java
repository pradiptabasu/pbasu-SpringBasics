package com.pbasu.simple;

import java.util.List;
import java.util.Map;

public class Fruits {

	private String myName;
	
	private List<String> fruitNameList;
	private Map<String,String> fruitNameMap;

	public String getMyName() {
		return myName;
	}

	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Fruits() {

	}

	public Fruits(String name) {
		setMyName(name);
	}

	public String talkAboutYourself() {
		String speech = "Hello I am a Fruit.";
		
		if (myName != null)
			speech += " I am " + getMyName();
		if(fruitNameList!=null && fruitNameList.size() >0)
		{
			speech += "\nList: ";
			for(int i=0;i<fruitNameList.size();i++)
			{
				speech += "\n\tName: "+ fruitNameList.get(i);
			}
		}
		if(fruitNameMap!=null && fruitNameMap.size() >0)
		{
			speech += "\nMap: ";
			for(Map.Entry<String, String> fruitName : fruitNameMap.entrySet())
			{
				speech += "\n\t"+fruitName.getKey()+" ===>>>> "+ fruitName.getValue();
			}
		}
		
		return speech;
	}
}
