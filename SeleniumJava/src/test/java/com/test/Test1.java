package com.test;

import org.testng.annotations.Test;

public class Test1 {

	@Test(priority=2)
	public void testserver()
	{
		System.out.println("Welome to the chrome");
		// TODO Auto-generated method stub

	}
	
	@Test(priority=1)
	public void testserver1()
	{
		System.out.println("Welome to the firefox");
		// TODO Auto-generated method stub

	}

}
