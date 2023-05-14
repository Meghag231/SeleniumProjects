package com.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class part2flipbike 
{
	public static void main(String[]args) throws InterruptedException
	{
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
    driver.findElement(By.name("q")).sendKeys("bike");
	Thread.sleep(2000);
	List<WebElement>allsug=driver.findElements(By.className("_1MRYA1"));
	ArrayList al = new ArrayList();
	for(WebElement sug:allsug)
	{
	System.out.println((sug.getText()));
		
	}
    Collections.reverse(al);
    System.out.println(al);
	
	
	
	}
	
}









	





