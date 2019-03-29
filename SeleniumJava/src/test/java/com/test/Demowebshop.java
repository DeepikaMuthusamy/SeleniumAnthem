package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demowebshop {
	@Test
	public void shopping()
	{
		WebDriver driver=new test3().getDriver("Chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul/li/a"));
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@value='F']")).click();
		driver.findElement(By.xpath(("//input[@id='FirstName']"))).sendKeys("Deepika");
		driver.findElement(By.xpath(("//input[@id='LastName']"))).sendKeys("Muthu");
		driver.findElement(By.xpath(("//input[@id='Email']"))).sendKeys("xyz533386886@mail.com");
		driver.findElement(By.xpath(("//input[@id='Password']"))).sendKeys("deepika");
		driver.findElement(By.xpath(("//input[@id='ConfirmPassword']"))).sendKeys("deepika");
		driver.findElement(By.xpath(("//input[@id='register-button']"))).click();
		String Logout=driver.findElement(By.xpath(("//a[@href='/logout']"))).getText();
		Assert.assertEquals(Logout, "Log out");
		System.out.println("Lggout link is verified");
		driver.findElement(By.xpath(("(//a[@href='/apparel-shoes'])[1]"))).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@href='/casual-belt'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='addtocart_40_EnteredQuantity']")).clear();
		driver.findElement(By.xpath("//input[@id='addtocart_40_EnteredQuantity']")).sendKeys("10");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath(("//input[@id='add-to-cart-button-40']"))).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"))).perform();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String cart=driver.findElement(By.xpath("//div[@class='quantity']/span")).getText();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		System.out.println("the total items added in cart" +cart);
		//Assert.assertEquals(cart, 10);
		
		
		
		
		
		
	}

}
