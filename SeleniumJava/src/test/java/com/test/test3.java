package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class test3 {

	public WebDriver getDriver(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.28\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		return new ChromeDriver();
		}
		
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Training_c2a.04.28\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		
		
		}
		else
		{
		return null;
		}
	}

}
