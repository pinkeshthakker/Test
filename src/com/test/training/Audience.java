package com.test.training;

import org.springframework.stereotype.Component;

@Component("audience")
public class Audience {
	
	public void takeSeats()
	{
		System.out.println("Take Seats :");
	}
	public void turnoffMobile()
	{
		System.out.println("turnoffMobile:::");
	}
	public void appLauds()
	{
		System.out.println("appLauds:::");
	}

}
