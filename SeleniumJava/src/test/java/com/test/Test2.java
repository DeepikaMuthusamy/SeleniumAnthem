package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tetsbrowser() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.28\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		//WebElement India=driver.findElement();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_c2a.04.28\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(); 
				//Assert.assertEquals(title, "view-source:https://www.google.com/");
		System.out.println("Welcome to IE");
	
		
		
	}

}
