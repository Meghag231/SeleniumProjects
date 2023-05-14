package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class p2flipkart 
{
	public static void main(String[]args)
	{
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement web = driver.findElement(By.xpath("//img[@alt='Home']"));
		Actions s = new Actions(driver);
		s.moveToElement(web).perform();
		WebElement web1 = driver.findElement(By.xpath("//a[text()='Kitchen & Dining ']"));
		s.moveToElement(web1).perform();
		
		
	 }
}


