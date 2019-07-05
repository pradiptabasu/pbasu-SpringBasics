package com.pbasu.simple;

public class Dairy {

	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String talkAboutYourself() {
		if (myName != null)
			return "Hello I am a Dairy. I am " + getMyName();
		else
			return "Hello I am a Dairy";
	}
}
