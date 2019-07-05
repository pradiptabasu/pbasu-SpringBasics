package com.pbasu.simple.spel.xml;

import org.springframework.stereotype.Component;

@Component
public class UnixScript implements ICommandLineScript {

	public String viewDirectoryContents(String dir) {
		return "ls " + dir;
	}

}
