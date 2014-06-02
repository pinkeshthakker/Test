package com.test.training;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singltoneExample")
public class SingltoneExample {
	
	private String display ="default";

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	

}
