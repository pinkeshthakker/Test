package com.test.training;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypExample")
@Scope("prototype")
public class PrototypExample {
	
	private String display ="default";

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	

}
