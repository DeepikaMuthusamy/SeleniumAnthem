package com.test;

import java.util.List;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cleartrip {
	@Test
	public void trip() throws Exception
	{
		WebDriver driver=new test3().getDriver("Chrome");
		driver.manage().window().maximize();
		driver.get("https://cleartrip.com");
		Thread.sleep(1500);
//		driver.findElement(By.id("FromTag")).sendKeys("hyd");
//		Thread.sleep(5000);
//		Actions act1=new Actions(driver);
//		//act1.sendKeys(Keys.TAB).perform();
//		act1.sendKeys(Keys.ENTER).perform();
//		driver.findElement(By.id("ToTag")).sendKeys("ban");
//		Thread.sleep(5000);
//		act1.sendKeys(Keys.ENTER).perform();
		
		
//		Actions act2=new Actions(driver);
//		act2.keyDown(from,Keys.SHIFT).sendkeys
		WebElement from=driver.findElement(By.id("FromTag"));
		from.sendKeys("hyd");
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.id("ui-id-2"), By.className("list")));
		WebElement ul=driver.findElement(By.id("ui-id-2"));
		List<WebElement> list=ul.findElements(By.tagName("li"));
		for(WebElement e:list)
		{
			if(e.getText().contains("HDD")) {
				e.click();
				break;
			}
			
			}
		String val=driver.findElement(By.id("ToTag")).getAttribute("value");
		Assert.assertTrue(val.contains("HDD"));
		
		
		
	}

}
