package com.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class test5 {
	@Test
	public void bank() throws Exception
	{
		WebDriver driver=new test3().getDriver("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(("//a[contains(text(),'Login')]"))).click();
		//System.out.println();
		String home=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		for(String s:set)
		{
			System.out.println(s);
		
		}
		Object[] obj=set.toArray();
		driver.switchTo().window(obj[1].toString());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//html/body/div[4]/div[2]/div[1]/a"));
		
		driver.switchTo().frame(driver.findElement(By.name("login_page")));
		driver.findElement(By.cssSelector("img[alt='continue']")).click();
		if(ExpectedConditions.alertIsPresent()!=null)
		{
			Alert al=driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
		}
		driver.findElement(By.name("fldLoginUserId")).sendKeys("54656565");
		driver.close();
		driver.switchTo().window(home);
		driver.close();
		
		
		//driver.findElement(By.xpath("((//a[@class="btn btn-default redBtn"])[2])")).click();
	}

}
