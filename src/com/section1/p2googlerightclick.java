package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class p2googlerightclick
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//a[text()='Gmail']"));
		//act.moveToElement(Gmail).click().build().perform();
	    act.contextClick(w).build().perform();
	   // act.moveToElement(w).click().build().perform();
	    //act.moveToElement().click().build().perform();
		
		
	}

}

