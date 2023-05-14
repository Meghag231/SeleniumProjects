package com.section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class part21 
{
	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		for(WebElement link:alllinks)
		{
			System.out.println(link.getText());
		}
	}
}
