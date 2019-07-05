package com.pbasu.simple.spel.xml;

import org.springframework.stereotype.Component;

@Component
public class WinScript implements ICommandLineScript {

	public String viewDirectoryContents(String dir) {
		// TODO Auto-generated method stub
		return "dir " + dir;
	}

}
