package com.test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class run
{
public void Browserlaunch() throws Exception
{
	WebDriver driver=new test3().getDriver("Chrome");
	driver.manage().window().maximize();
	driver.get("http://google.com");
//	WebElement Email= driver.findElement(By.id("Email"));
//	Email.sendKeys("askmail@email.com");
//	WebElement Register=driver.findElement(By.cssSelector("input[value='Register']"));
//	Register.click();
//	
//	WebElement Gender=driver.findElement(By.id("gender-female"));
//	Gender.click();
//	
//	WebElement FN=driver.findElement(By.id("FirstName"));
//	FN.sendKeys("Deepika");
//	
//	WebElement LN=driver.findElement(By.id("LastName"));
//	LN.sendKeys("Muthusamy");
//	
//	WebElement Email= driver.findElement(By.id("Email"));
//	Email.sendKeys("abcdeef5ggemail@email.com");
//	
//	WebElement pw=driver.findElement(By.id("Password"));
//	pw.sendKeys("abc123");
//	
//	WebElement confpw=driver.findElement(By.id("ConfirmPassword"));
//	confpw.sendKeys("abc123");
//	WebElement regbtn=driver.findElement(By.id("register-button"));
//	regbtn.click();
//	
//	String result=driver.findElement(By.xpath("//div[@class='result']")).getText();
//	Assert.assertEquals(result, "Your registration completed");
//	System.out.println("Your registration completed");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver. findElement(By.xpath("//div/a[@title='Google apps']")).click();
	WebElement ul=driver. findElement(By.xpath("//div[@aria-label='Google apps']/ul/li"));
	//driver.findElement(By.xpath("(//span[@class='gb_k'])[5]")).click();
	List<WebElement> list=ul.findElements(By.tagName("li"));
	System.out.println("The count of apps are" +list.size());
	for(WebElement e:list)
	{
		if(e.getText().contains("Play"))
			e.click();
		break;
	}
	Assert.assertTrue(driver.getCurrentUrl().contains("play"));
	}
	
	
//	Thread.sleep(150000);
	
	
	
	
			
//	WebElement Password= driver.findElement(By.id("Password"));
//	Password.sendKeys("abc123");
//	
//	WebElement Login= driver.findElement(By.cssSelector("input[value='Log in']"));
//	Login.click();
	
}
	


