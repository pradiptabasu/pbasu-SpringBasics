package com.pbasu.simple;

public class Grains {

	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String talkAboutYourself() {
		if (myName != null)
			return "Hello I am a Grains. I am " + getMyName();
		else
			return "Hello I am a Grains";
	}
	
	public void myInitMethod()
	{
		System.out.println("Hello I am in Grains Init method");
	}
	
	public void myDestroyMethod()
	{
		System.out.println("Hello I am in Grains Destroy method");
	}
}
