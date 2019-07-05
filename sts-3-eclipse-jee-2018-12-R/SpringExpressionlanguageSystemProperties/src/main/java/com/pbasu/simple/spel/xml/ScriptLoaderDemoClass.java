package com.pbasu.simple.spel.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ScriptLoaderDemoClass {
	
	@Value("#{systemProperties['os.name'] matches 'Windows.*' ? winScript : unixScript}")
	private ICommandLineScript script;

	public ICommandLineScript getScript() {
		return script;
	}

	public void setScript(ICommandLineScript script) {
		this.script = script;
	}
	
	public ScriptLoaderDemoClass() {
	}
	
	public void loadScript() {
		System.out.println("Loading Script of type : " + script.getClass());
		System.out.println(script.viewDirectoryContents("myDirLoc"));
	}
}
