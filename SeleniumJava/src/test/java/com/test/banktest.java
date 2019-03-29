package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class banktest {
	
	@Test

	public void netbanking() throws Exception
	{
		// TODO Auto-generated method stub
		WebDriver driver=new test3().getDriver("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath(("//html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div/a"))).click();
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards']"))).perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']"))).click().perform();
		Assert.assertTrue(driver.getCurrentUrl().contains("cards"));
		
	}

}
