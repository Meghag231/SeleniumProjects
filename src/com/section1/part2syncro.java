package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class part2syncro 
{
	public static void main(String[]args)
	{
		WebDriver driver  = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("/https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String title=driver.getTitle();
		driver.findElement(By.className("_3704LK")).sendKeys("iphone x",Keys.ENTER);
		System.out.println("driver.getTitle()");
				
	}
	

}
